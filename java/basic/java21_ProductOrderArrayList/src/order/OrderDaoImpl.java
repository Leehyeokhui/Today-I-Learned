package order;

import java.util.ArrayList;

public class OrderDaoImpl implements OrderDao {
	private ArrayList<Order> orders;
	private int cnt;

	public OrderDaoImpl() {
		orders = new ArrayList<>();
	}

	@Override
	public void insert(Order o) {
		// TODO Auto-generated method stub
		orders.add(o);
		cnt++;
	}

	@Override
	public ArrayList<Order> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Order> o = new ArrayList<>();
		o.addAll(orders);
		return o;
	}

	@Override
	public Order select(int order_num) {
		// TODO Auto-generated method stub
		for (Order o : orders) {
			if (o.getOrder_num() == order_num) {
				return o;
			}
		}
		return null;
	}

	@Override
	public void delete(int order_num) {
		// TODO Auto-generated method stub
		// 주문 번호로 검색.
		Order o = select(order_num);
		if(!orders.contains(o)) {
			System.out.println("없는 주문 번호");
		} else {
			if(o.isPay_result()) {
				System.out.println("이미 결제한 상품은 취소 불가");
				return;
			}else {
				orders.remove(o);
			}
		}
		cnt--;
	}

	@Override
	public void update_pay(int order_num) {
		// TODO Auto-generated method stub
		Order o = select(order_num);
		if (o == null) {
			System.out.println("없는 주문 번호");
		} else {
			o.setPay_result(true);
		}
	}

	@Override
	public void update_out(int order_num) {// 공장쪽 출고 처리시 사용
		// TODO Auto-generated method stub
		Order o = select(order_num);
		if (o == null) {
			System.out.println("없는 주문 번호");
		} else {
			o.setOut_result(true);
		}
	}

	@Override
	public ArrayList<Order> selectByPayFalse() {// 결제를 안한 주문 목록
		// TODO Auto-generated method stub
		ArrayList<Order> o = new ArrayList<>();
		ArrayList<Order> dest = null;
		if (cnt == 0) {
			System.out.println("주문 내역이 없습니다.");
			return null;
		}
		for (Order s : orders) {
			if (s == null)
				break;
			if (!s.isPay_result()) {
				o.add(s);
			}
		}
		if (o.size() == 0) {
			System.out.println("결제 대상이 없습니다.");
			return null;
		}
		dest = new ArrayList<>();
		dest.addAll(o);
		return dest;
	}

	@Override
	public ArrayList<Order> selectByOutFalse() {// 공장에서 사용. 출고대상. out_result가 false이고 pay_result가 true인 것만 검색해서 반환
		// TODO Auto-generated method stub
		ArrayList<Order> o = new ArrayList<>();
		ArrayList<Order> dest = null;
		if (cnt == 0) {
			System.out.println("주문 내역이 없습니다.");
			return null;
		}
		for (Order s : orders) {
			if (s == null)
				break;
			if (!s.isOut_result()) {
				o.add(s);
			}
		}
		if (o.size() == 0) {
			System.out.println("출고 대상이 없습니다.");
			return null;
		}
		dest = new ArrayList<>();
		dest.addAll(o);
		return dest;
	}

}
