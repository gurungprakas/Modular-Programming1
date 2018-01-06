<%-- 
    Document   : index.jsp
    Created on : Aug 11, 2017, 12:04:49 AM
    Author     : Prakas
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact No</th>
            </tr>
            <c:forEach var="customer" items="${customers}">
                <tr>
                    <td>${customer.customerId}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.Email}</td>
                    <td>${customer.ContactNo}</td>
                </tr>
                
            </c:forEach>
        </table>
    </body>
</html>
