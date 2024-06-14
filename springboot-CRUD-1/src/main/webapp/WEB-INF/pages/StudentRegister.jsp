<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO STUDENT REGISTER PAGE</h3>
<form:form action="save" method="POST" modelAttribute="student">
<pre>
NAME  : <form:input path="stdName"/>
		<from:errors path="stdName"/>
GENDER: 
  <form:radiobutton path="stdGen" value="Male"/> Male
  <form:radiobutton path="stdGen" value="Female"/> Female
PASSWORD: <form:password path="stdPwd"/>
COURSE  : <form:select path="stdCource">
				<form:option value="">-SELECT-</form:option>
				<form:option value="Java">Java</form:option>
				<form:option value="Angular">Angular</form:option>
				<form:option value="dotNet">dotNet</form:option>
				<form:option value="PHP">PHP</form:option>
			</form:select>       
ADDRESS : <form:textarea path="stdAddr"/>
DOB		: <form:input path="stdDob" type="date"/>
LANGUAGES:
        <form:checkbox path="stdLang" value="ENG"/> ENG
        <form:checkbox path="stdLang" value="HIN"/> HIN
        <form:checkbox path="stdLang" value="TAM"/> TAM
        <form:checkbox path="stdLang" value="TEL"/> TEL
		<input type="submit" value="Add Student">
</pre>
</form:form>
 ${msg}
</body>
</html>