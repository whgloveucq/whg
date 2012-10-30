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
<%--<s:property value="userid"/>--%>
${sessionScope.userid} 

<div>
<s:form action="AddBulletin" method="">
<table align="left" border="1">
<tr >
<td></td>
<td>
<s:text name="Title" property="title"  />
</td>
<td></td>
</tr>
<tr>
<td></td>
<td><s:text name="Content" property="content" size="" /></td>
<td></td>
</tr>
<tr>
<td></td>
<td><s:file name="upload" property="appendix" /></td>
<td></td>
</tr>
<tr>
<td></td>
<td><s:submit /></td>
<td></td>
</tr>

</table>

<br/>

</s:form>


</div>



</body>
</html>