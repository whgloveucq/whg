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
<title>商业拍卖Java EE程序框架</title>
</head>
<body> 
<br />
welcome, 
<%--<html:property value="userid"/>--%>
${sessionScope.userid} 



<Table>
	<Tr>
		<td>
<div align="center">
<s:actionerror cssClass="error"/>
<s:form action="addbulletin" method="post">
	<s:textfield name="Title"  label="标题" property="title"/>
	<s:textfield name="Contenet" label="内容"/>
	<s:textfield name="Appendix" label="附件"/>
	<s:submit value="提交"/>
</s:form>
 <%-- 验证码：<img name="d" src="authImg.jpg"> --%>
</div>


</Td>
	</Tr>
</Table> 




</body>
</html>