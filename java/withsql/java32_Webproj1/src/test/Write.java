package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.board.Board;
import board.board.BoardService;

/**
 * Servlet implementation class Write
 */
@WebServlet("/Write")
public class Write extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Write() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("test/test/write_form.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		request.setCharacterEncoding("euc-kr");
		response.setCharacterEncoding("euc-kr");
		response.setContentType("text/html");
		
		BoardService service = new BoardService();
		
		String writer = (String) session.getAttribute("id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		service.addBoard(new Board(0, writer, null, title, content));
		request.setAttribute("writeMsg", writer + "님 게시글 작성이 완료되었습니다.");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/NotionBoard");
		dispatcher.forward(request, response);
	}

}
