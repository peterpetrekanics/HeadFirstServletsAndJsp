<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TwoServletsInteracting2</title>
</head>
<body>
This web app is a test application. <br><br>
The goal is to proove that the attributes that are shared between servlets should be protected, <br>
and only one servlet should access/modify an attribute at a time. <br><br>
This web app shows the correct way of handling the attributes: <br>
servlet1 is reading the "myProgress" attribute, and servlet2 keeps changing it. <br>
In this example, we wait until servlet2 changed the attribute to <br>
a final value, and then servlet1 can read that final value afterwards. <br><br>
Open this page in another browser and start servlet1 in this browser <br>
then start servlet2 in the other browser and then watch the screen as the attribute changes <br>
Please wait 30 seconds to see the results. <br>


        <form action="servlet1" method="post">
            <p>servlet1: <input type="submit"></p>
            <p>Current status: <span id="progress">0</span>%</p>
        </form>

        <form action="servlet2" method="post">
            <p>servlet2: <input type="submit"></p>
            <p>Current status: <span id="progress">0</span>%</p>
        </form>

</body>
</html>