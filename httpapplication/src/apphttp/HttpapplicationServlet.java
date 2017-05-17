package apphttp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HttpapplicationServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String n1 = req.getParameter("t1");
		String n2 = req.getParameter("t2");
		if(n2.equals("maneesh"))
		{
			out.println("welocme"+n1+"<br>");
			HttpSession session = req.getSession();
			session.setAttribute("nam", n1);
			req.getRequestDispatcher("href.html").include(req, resp);
		}
		else
		{
			out.println("please enter correct password");
			req.getRequestDispatcher("index.html").include(req, resp);
		}
		
	}
}
