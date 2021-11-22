<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세 정보 화면</title>
</head>
<body>
	
	<h2>학생 상세 정보</h2>
	
	<table>
		<tr>
			<td>id</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${member.name}</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${member.age}</td>
		</tr>
	</table>
	
</body>
</html>