package com.encore.inter2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Service service = new Service(new DaoImpl_Oracle());
		Service service = new Service(new DaoImpl_Mysql());
		
		service.add();
		service.get();
		service.edit();
		service.del();
		
		
		
	}
}

/*
 * vo.dao(interface)
 * 유즈케이스 그리기(요구분석)
 * 제품 - 번호(int), 이름(String), 가격(int), 수량(int)
 * dao : insert(Product p), Product selectbyNum(int num), 
 *       Product[] selectbyName(String name)
 * 창고
 * 1. 제품등록(번호 자동 할당) => 제품번호생성, 제품명 입력, 가격, 수량 입력받아서 등록(db에 insert) => 객체 추출
 * 2. 검색(번호로 이름으로) => 제품번호 입력, db에서 검색, 
 * 3. 수정(번호로 검색, 가격수정)
 * 4. 삭제
 * 5. 전체목록
 * 6. 입출고
 * 7. 종료
 * 
 * vo(product)
 * 
 */









