package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CommandService;

public class MyInfoAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// 1. model 사용(객체 생성)
		CommandService service = new CommandService();
		StringBuffer sb = service.getMyinfo();
		
		// 2. request에 저장
		request.setAttribute("myinfo", sb);
		
		// 3. view 페이지 리턴
		return "/view/myinfo.jsp";
	}

}
