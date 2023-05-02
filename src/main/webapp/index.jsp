<%@ page import="com.example.testclient.Tester" %>
<%@ page import="com.example.testclient.TestService" %>
<%@ page import="com.example.testclient.Person" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet"></a>
<%
    Tester x = new Tester();
    TestService testService = x.getTestServicePort();
    Person result = testService.sendPerson("Berkay","Ağırcan",1907190719);
%>
Result = <%=result.getName()+" "+result.getSurname()%>
</body>
</html>