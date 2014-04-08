<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hotel Login</title>
</head>
<body>
	<s:form action="login" namespace="/" method="post">
		<table>
			<tr>
				<s:actionmessage />
			</tr><tr>
				<s:textfield name="user.name" label="名子" value="DDD"></s:textfield>
			</tr><tr>
				<s:password name="user.passwd" label="密碼" value=""></s:password>
			</tr><tr>
				<s:submit method="execute" value="Login"></s:submit>
			</tr>
		</table>
	</s:form>
</body>
</html>