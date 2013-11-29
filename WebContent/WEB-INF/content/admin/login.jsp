<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/static/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="page.admin.login.title"/></title>
</head>
<body>
<s:form action="userList">
<dl>
  <dd><s:textfield name="txtUsername" key="page.admin.login.username"/></dd>
  <dd><s:password  name="txtPassword" key="page.admin.login.password"/></dd>
  <dd><s:submit key="page.admin.login.login"/></dd>
</dl>
</s:form>

</body>
</html>