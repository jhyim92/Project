<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 로그인 후 페이지 --%>
	<div>
		<header>
			<h1>마이페이지</h1>
		</header>
		<div>
			<input type="button" value="회원정보 수정" onclick="location.href='userUpdateForm.do?user_id=${sessionID}'">
		</div>
		<div>
			<input type="button" value="로그아웃" onclick="location.href='userLogoutPro.do?user_id=${sessionID}'">
		</div>
		<div>
			<input type="button" value="회원탈퇴" onclick="location.href='userDeleteForm.do?user_id=${sessionID}'">
		</div>
		<div>
			<input type="button" id="hidden" value="문의사항" onclick="location.href='userAskForm.do?board_num=3'">
		</div>
	</div>
	
	<c:if test="${sessionCODE != 2}">
		<button type="button" onclick="location.href='userList.do?user_id=${sessionID}'">모든회원정보</button>	
	</c:if>
</body>
</html>