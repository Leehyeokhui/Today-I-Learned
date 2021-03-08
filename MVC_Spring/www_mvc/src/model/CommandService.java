package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandService {

	/**
	 * 기본 생성자
	 */
	public CommandService() {
		super();
	}

	public StringBuffer getMyinfo() {
		StringBuffer sb = new StringBuffer();
		sb.append("<li> 이름 : 홍길동 <br>");
		sb.append("<li> 전화번호 : 010-0000-1111 <br>");
		sb.append("<li> 주소 : 서울시 서초구 <br>");
		sb.append("<li> 성격 : 친절함 <br>");

		return sb;
	}

	public StringBuffer getHello() {
		StringBuffer sb = new StringBuffer();
		sb.append("<li> 안녕하세요..MVC 입니다.<br>");
		sb.append("<li> Template Page<br>");
		sb.append("<li> URI Command Pattern<br>");
		sb.append("<li> Properties 파일을 이용한 처리입니다.<br>");

		return sb;

	}

	public String getDate() {
		Date dt = new Date();
		String str = dt.toLocaleString();

		return str;
	}

	public List<Map> teamList() {
		List<Map> list = new ArrayList<Map>();
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "김씨");
		map.put("phone", "010-0000-1111");
		map.put("address", "서울시 서초구");

		list.add(map);

		map = new HashMap<String, String>();
		map.put("name", "이씨");
		map.put("phone", "010-1111-2222");
		map.put("address", "서울시 동작구");

		list.add(map);

		map = new HashMap<String, String>();
		map.put("name", "박씨");
		map.put("phone", "010-2222-3333");
		map.put("address", "서울시 강남구");

		list.add(map);

		map = new HashMap<String, String>();
		map.put("name", "최씨");
		map.put("phone", "010-3333-4444");
		map.put("address", "서울시 용산구");

		list.add(map);

		return list;
	}

}