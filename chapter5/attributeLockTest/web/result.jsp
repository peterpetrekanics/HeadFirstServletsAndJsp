<%@ page import="java.util.*" %>
<html>
<body>
<h1 align="center"> Result Page - displaying the attribute value</h1>

<p>

<style>
#myProgress {
  position: relative;
  width: 100%;
  height: 30px;
  background-color: #ddd;
}

#myBar {
  position: absolute;
  width: 1%;
  height: 100%;
  background-color: #4CAF50;
}
</style>

<div id="myProgress">
  <div id="myBar"></div>
</div>

<script>
window.onload = move;
function move() {
  var elem = document.getElementById("myBar");   
  var width = 1;
  var id = setInterval(frame, 10);
  function frame() {
    if (width >= 100) {
      clearInterval(id);
    } else {
      width++; 
      elem.style.width = width + '%'; 
    }
  }
}
</script>




<%
 String myAttribute = (String)getServletContext().getAttribute("foo");
 //String myAttribute = getServletContext().getInitParameter("foo");
	 out.print("<br>myAttribute: " + myAttribute);
 %>
 
 </body>
 </html>