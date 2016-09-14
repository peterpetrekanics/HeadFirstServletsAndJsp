package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class AttributeChanger extends HttpServlet {
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws IOException, ServletException {


//Commenting out the response writing lines, because the RequestDispatcher will fail otherwise
// response.setContentType("text/html");
// PrintWriter out = response.getWriter();
// out.println("test context attributes<br>");
// out.println("foo value:<br>");
// out.println(getServletContext().getInitParameter("foo"));

getServletContext().setAttribute("foo", "changedvalue");
// out.println("<br>foo value:<br>");
// out.println(getServletContext().getAttribute("foo"));

RequestDispatcher view = request.getRequestDispatcher("result.jsp");
view.forward(request, response);
}
}