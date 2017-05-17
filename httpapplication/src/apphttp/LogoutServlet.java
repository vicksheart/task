package apphttp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		session.invalidate();
		out.println("You are successfully logged out");
		out.println("<a href=index.html>click here for login agian</a>");
		out.close();
	}
}