<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	  <h2>게시글등록</h2>
	  <form action="/doForm1" name="frm" method="post" enctype="multipart/form-data">
	    <label>제목</label>
	    <input type="text" name="btitle">
	    <br>
	    <input type="file" name="files">
	    <br>
	    <input type="submit" value="저장">
	  </form>
	</body>
</html>