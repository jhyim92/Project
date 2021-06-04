<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	text-align: center;
}

#a input {
	height: 100px;
	width: 300px;
}
</style>
</head>
<body>
	<form action="userAskPro.do" method="post">

		<table border="1">
			<caption>
				<h2>문의사항</h2>
				<input type="hidden" name="board_num" value="${board_num }">
			</caption>
			<input type="hidden" name="user_id" value="${sessionID }">
			<input type="hidden" name="post_num" value="${post_num }">
			<tr>
				<td>게시글번호</td>
				<td>${post_num }</td>
			</tr>
			<tr>
				<td>게시글명</td>
				<td><input type="text" name="post_name" required="required"></td>
			</tr>
			<tr>
				<td>게시글내용</td>
				<td id="a"><input type="text" name="post_cont"
					required="required" width="300" height="300"></td>
			</tr>
			<tr>
				<td><input type="submit" value="확인"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>

</body>
</html>