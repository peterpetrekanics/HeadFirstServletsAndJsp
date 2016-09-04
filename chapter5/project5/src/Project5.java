import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Project5 extends HttpServlet{
public void doGet ( HttpServletRequest request,
	HttpServletResponse response) throws IOException {
	PrintWriter out = response.getWriter();

	String myFoo = getServletContext().getInitParameter("foo");
	
	out.println("<html> <body>" + 
	"<h1 align = center> HF's Chap 5 - Getting the value of ServletContext</h1>" +
	"<p> <br> Value of the myFoo string is: " + myFoo +
	"</body> </html>");
	}
}