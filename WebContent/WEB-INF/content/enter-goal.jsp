<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter goal</title>
</head>
<body>
	<s:form action="enter-goal-save">
		<h1>Goal Amount</h1>
		<s:textfield name="goal" />
		<s:submit value="Save" />
	</s:form>
	<a href="<s:url action="enter-protein"/>">Enter protein</a>
</body>
</html>