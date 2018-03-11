<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://127.0.0.1:8080/ssm/static/js/jquery-3.3.1.js"></script>
</head>
<body>
<form id=“loginform”>
<input type = "text" name = "UserName" placeholder = "用户名" /><br/>
<input type="password" name = "Password" placeholder = "密码" />
<input type="button" id="btn" value ="提交" />
</form>
<script type="text/javascript">
$("#btn").click(function(){
	var test = $('form').serialize();
	$.ajax({
		url:'/ssm/Login/Login?'+test,
		success:function(data){
			//alert(data);
			console.log(data);
		}
	});
});
</script>
</body>
</html>