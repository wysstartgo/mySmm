<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>login</title>
<meta http-equiv="Content-Type"  />
<link type="text/css" rel="stylesheet" href="media/css/login.css" />

</head>
<body>
 <form action="UnitAction.doLogin.act" method="post">
	<div class="container">
		<img class="bg" src="media/css/login/bg.jpg" />
		<div class="main">
			<input type="text" name="username" />
			<input type="password" name="password" />
			<p class="border">
			      <%
	      String errorMsg = (String)request.getAttribute("errorMsg");
	      if(errorMsg != null) { 
      %>
   	  	     <span style="color:red;"><%=errorMsg %></span>
      <%} %>
				<input id="remember_pwd" type="checkbox" class="rempsw" />
				<label for="remember_pwd">¼Ç×¡ÃÜÂë</label>
			</p>
			<input type="submit" value="µÇÂ¼" />
		</div>
	</div>
	</form>
</body>
</html>
