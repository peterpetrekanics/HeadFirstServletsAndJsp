<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center"> Beer Recommendation JSP</h1>
<p>

<br>
  <a href="checkcookie.do">Click here to verify session information (to see what name you entered on the beer selector form)</a>
<br>
<%
 List styles = (List)request.getAttribute("styles");
 Iterator it = styles.iterator();
 while(it.hasNext()) {
	 out.print("<br>try: " + it.next());
 }
 %>
 <br>
 NODE1
 </body>
 </html>
