<%--
网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2010, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>whg  登陆程序</title>
</head>
<body>
<table width="780" align="center" cellspacing="0"
	>
<tr>
<td >
<h3>请输入用户名和密码登录系统</h3>
<div align="center">
<s:actionerror cssClass="error"/>
<s:form action="login" method="post">
	<s:textfield name="userId" label="用户名"/>
	<s:textfield name="passWord" label="密码"/>

	<s:submit value="登录"/>
</s:form>
 <%-- 验证码：<img name="d" src="authImg.jpg"> --%>
</div>
</td>
</tr>
</table>
</body>
</html>