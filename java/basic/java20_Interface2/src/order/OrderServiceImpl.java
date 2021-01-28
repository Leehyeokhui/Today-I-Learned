package order;

import java.util.Scanner;

public class OrderServiceImpl implements OrderService {

	private Dao dao;

	public OrderServiceImpl() {
		dao = new DaoImpl();
	}

	@Override
	public void addOrder(Order o) {
		// TODO Auto-generated method stub
		dao.insert(o);
	}

	@Override
	public void getAll() {// 주문내역
		// TODO Auto-generated method stub
		System.out.println("======= 주문 내역 ========");
		Order[] o = dao.selectAll();
		for (Order x : o) {
			System.out.println(x);
		}
	}

	@Override
	public Order getOrder(int order_num) {
		// TODO Auto-generated method stub
		return dao.select(order_num);
	}

	@Override
	public void cancelOrder(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("======= 주문 취소 ========");
		getAll();
		System.out.print("취소할 주문 번호:");
		int num = sc.nextInt();
		dao.delete(num);
	}

	@Override
	public void pay(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("======= 결제 ========");
		Order[] o = getByPayFalse();
		if (o == null) {
			return;
		}
		for (Order x : o) {
			System.out.println(x);
		}
		System.out.print("결제할 주문 번호:");
		int num = sc.nextInt();
		dao.update_pay(num);
	}

	@Override
	public Order[] getByPayFalse() {
		// TODO Auto-generated method stub
		return dao.selectByPayFalse();
	}

	@Override
	public Order[] getByOutFalse() {
		// TODO Auto-generated method stub
		return dao.selectByOutFalse();
	}

}
