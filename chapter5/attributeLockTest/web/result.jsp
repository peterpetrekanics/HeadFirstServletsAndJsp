<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center"> Result Page - displaying the attribute value</h1>

<p>

<%
 String myAttribute = (String)getServletContext().getAttribute("foo");
 //String myAttribute = getServletContext().getInitParameter("foo");
	 out.print("<br>myAttribute: " + myAttribute);
 %>
 
 </body>
 </html>