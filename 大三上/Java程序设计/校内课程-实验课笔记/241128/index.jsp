     <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <!DOCTYPE html>
     <html0>
     <head>
         <meta charset="UTF-8">
         <title>index</title>
     </head>
     <body>
         <h1>Hello World!</h1>
         <p>当前时间: <%= new java.util.Date() %></p>
         <%
             String className = "JavaEE程序设计";
             out.println("当前课程: " + className);
         %>
     </body>
     </html0>