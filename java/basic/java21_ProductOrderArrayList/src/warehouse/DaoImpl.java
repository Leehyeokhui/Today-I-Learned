package warehouse;

import java.util.ArrayList;

//배열에 추가, 수정, 삭제 ... 작업 수행
public class DaoImpl implements Dao {

	private ArrayList<Product> datas;// 저장소
	private int cnt;// 리스트에 저장된 데이터 개수.

	public DaoImpl() {
		datas = new ArrayList<>();// 단점=배열 생성시 크기 결정. 크기 고정. 배열의 크기와 데이터의 개수가 다름
		// datas.length:방의 개수만 나타내지 데이터의 개수를 나타내지 않는다. 데이터가 추가 삭제시 데이터의 개수를 따로 관리.
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		datas.add(p);
		cnt++;
	}

	@Override
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		for(Product p : datas) {
			if(p.getNum() == num) {
				return p;
			}
		}
		return null;// not found
	}

	@Override
	public ArrayList<Product> selectByName(String name) {
		// TODO Auto-generated method stub
		ArrayList<Product> p1 = new ArrayList<>();
		for (Product p : datas) {
			if (p.getName().equals(name)) {
				p1.add(p);
			}
		}
		return p1;
	}

	@Override
	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Product> p = new ArrayList<>();
		p.addAll(datas);
		return p;
	}

	@Override
	public void update(int num, int price) {
		// TODO Auto-generated method stub
		Product p = selectByNum(num);
		if (p != null) {
			p.setPrice(price);
		} else {
			System.out.println("없는 제품 번호");
		}
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		Product p = selectByNum(num);
		if(datas.contains(p)) {
			datas.remove(p);
		}
	}

	@Override
	public boolean in_out(int num, int a) {// a:수량. 입고:양수, 출고:음수
		// TODO Auto-generated method stub
		boolean flag = false;
		Product p = selectByNum(num);

		if (p != null) {
			int sum = p.getAmount() + a;
			if (sum < 0) {// 출고시 제품 수량 부족인 상황
				System.out.println("수량이 부족하여 출고 취소");
			} else {
				p.setAmount(sum);// 입출고 처리 완료
				flag = true;
			}
		} else {
			System.out.println("없는 제품 번호");
		}
		return flag;
	}

}
