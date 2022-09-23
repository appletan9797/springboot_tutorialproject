<%-- 
    Document   : home
    Created on : 6 Aug 2022, 2:55:36 am
    Author     : appletan
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<%--<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html> 
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Spring Boot Application</title>
        </head>
        <body>
            <form action="addAlien" method="post">
                <h2>Add Alien</h2>
                <input type="text" name="aid"><br>
                <input type="text" name="aname"><br>
                <input type="text" name="tech"><br>
                <input type="submit"><br>
            </form>
            <br>
            
            <form action="getAlien">
                <h2>Get Alien</h2>
                <input type="text" name="aid"><br>
                <input type="submit"><br>
            </form>
        </body>
    </html>
</f:view>
