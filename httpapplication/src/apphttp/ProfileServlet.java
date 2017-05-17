package apphttp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ProfileServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("href.html").include(req, resp);
		HttpSession session = req.getSession(false);
		if(session!=null)
		{
			String n3 = (String)session.getAttribute("nam");
			out.println("Hello"+n3+"welcoome to your new profile");
		}
		else
		{
			out.println("Please login first");
			req.getRequestDispatcher("index.html").include(req,resp);
		}
		out.close();
	}
}