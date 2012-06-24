<%@taglib prefix="spring" uri="/spring"%>
<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title><spring:message code="title"/></title></head> 
<body> 
    <form name="User" action="login.html" method="post">
<spring:bind path="command.username"> 
        <spring:message code="username"/><input type="text" name="${status.expression}" value="${status.value}"/><br>
	          <font color="red"><b>${status.errorMessage}</b></font><br>
        </spring:bind>
<spring:bind path="command.password"> 
        <spring:message code="password"/>  <input type="password" name="${status.expression}" value="${status.value}"/><br>
	          <font color="red"><b>${status.errorMessage}</b></font><br>
        </spring:bind>
<spring:bind path="command.password2"> 
         <spring:message code="password2"/>  <input type="password" name="${status.expression}" value="${status.value}"/><br>
	          <font color="red"><b>${status.errorMessage}</b></font><br>
        </spring:bind>
<input type="submit" value="<spring:message code="submit"/>"/>
    </form> 
</body> 
</html>
