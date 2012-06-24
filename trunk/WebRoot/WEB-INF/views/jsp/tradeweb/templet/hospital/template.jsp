<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
<title>${title}-<tiles:insertAttribute name="title"/></title>
<tiles:insertAttribute name="header"/>
</head>
<body>
<tiles:insertAttribute name="top"/>
<tiles:insertAttribute name="content"/>
<tiles:insertAttribute name="footer"/>
</body>
</html>
