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
		<%-- 회원가입 결과 --%>
	<c:if test="${result > 0 }">
		<script type="text/javascript">
			alert("회원가입 완료");
			location.href = "userLoginForm.do";
		</script>
	</c:if>
	<c:if test="${result == 0 }">
		<script type="text/javascript">
			alert("회원가입 실패");
			history.back();
		</script>
	</c:if>
</body>
</html>