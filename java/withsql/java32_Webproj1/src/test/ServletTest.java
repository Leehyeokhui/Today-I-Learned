package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();//응답 페이지에 출력할 outputStream 생성
		
		//클라이언트가 전송한 폼파라메터 받음
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String gen = request.getParameter("gen");
		String[] hobby = request.getParameterValues("hobby");
		int grade = Integer.parseInt(request.getParameter("grade"));
		
		//응답 페이지 작성
		out.print("<html><body>");
		out.print("id:"+id+"<br/>");
		out.print("pwd:"+pwd+"<br/>");
		out.print("gen:"+gen+"<br/>");
		out.print("hobby:");
		for(String s:hobby){
			out.print(s);
		}
		out.print("<br/>");
		out.print("grade:"+grade+"<br/>");
		out.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
