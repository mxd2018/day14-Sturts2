<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 注意：如果采用动态方法调用的方式，就不需要.action的扩展名了，（该方式一般不推荐使用，因为在地址请求栏会暴露请求的方法） -->
	<form action="${pageContext.request.contextPath}/login3!addUser" method="post">
		<!-- 注意使用对象传递数据，name属性需要  对象.属性的写法 -->
		用户名:<input type="text" name="username">
		<br>
		密码:<input type="password" name="password">
		<br>
		年龄:<input type="text" name="age">
		<br>
		<input type="submit" value="提交">
	</form>
</body>
</html>