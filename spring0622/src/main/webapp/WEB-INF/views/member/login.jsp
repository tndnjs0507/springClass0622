<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
	</head>
	<body>
	  <h2>로그인</h2>
	  <form action="doLogin" method="post" name="frm">
	    <label>아이디</label>
	    <input type="text" name="id"><br>
	    <label>패스워드</label>
	    <input type="password" name="pw"><br>
	    <input type="submit" value="전송"><br>
	  </form>
	</body>
</html>