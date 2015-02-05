<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
	<title>login</title>
	
	<script src="media/ext-4.2.1-gpl/ext-all-debug.js"></script>
	<link href="media/ext-4.2.1-gpl/resources/css/ext-all.css" rel="stylesheet" />
	
	<script type="text/javascript">
		Ext.application({  
		    name: 'HelloExt',  
		    launch: function() {  
		        Ext.create('Ext.container.Viewport', {  
		            layout: 'fit',  
		            items: [  
		                {  
		                    title: 'Hello Ext',  
		                    html : 'Hello! Welcome to Ext JS.'  
		                }  
		            ]  
		        });  
		    }  
		});  
    </script>
</head>
<body>
	<h2>Hello World!</h2>
	<form action="UserController/addUser.do">
		<input type="text" name="username">
		<input type="text" name="password">
		<input type="submit" value="注册">
	</form>
</body>
</html>
