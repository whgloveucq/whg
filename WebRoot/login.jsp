<%--
��վ: <a href="http://www.crazyit.org">���Java����</a>
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
<title>whg  ��½����</title>
</head>
<body>
<table width="780" align="center" cellspacing="0"
	>
<tr>
<td >
<h3>�������û����������¼ϵͳ</h3>
<div align="center">
<s:actionerror cssClass="error"/>
<s:form action="login" method="post">
	<s:textfield name="userId" label="�û���"/>
	<s:textfield name="passWord" label="����"/>

	<s:submit value="��¼"/>
</s:form>
 <%-- ��֤�룺<img name="d" src="authImg.jpg"> --%>
</div>
</td>
</tr>
</table>
</body>
</html>