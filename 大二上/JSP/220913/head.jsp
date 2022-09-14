<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/9
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<style>
    .top{
        width: 100%;
        height: 30px;
        background-color: brown
    }
    .log{
        width: 1000px;
        /*height: 81px;*/
        margin: 0 auto;
    }
    .nav{
        width: 100%;
        height: 50px;
        background-color: lightgray;
    }
    .nav_colum{
        width: 1000px;
        height: 50px;
        /*border: 2px solid #c7edcc;*/
        margin: 0 auto;
    }
    .nav .nav_colum ul, .nav .nav_colum li{
        list-style: none;
        padding: 0;
        margin: 0;
    }
    .nav .nav_colum ul li{
        width: 125px;
        height: 50px;
        float: left;
        line-height: 50px; /* 垂直方向居中 */
        text-align: center; /* 水平方向居中 */
    }
    .nav .nav_colum ul li a{
        text-decoration: none;
        color: black;
        display: block;
    }
    .nav .nav_colum ul li a:hover{
        background-color: brown;
        color: white;
    }
</style>
<div class="top"></div>
<div class="log">
   <img src="https://img.mole9630.top/blog-logo.png" width="100px" height="100px">
</div>
<div class="nav">
    <div class="nav_colum">
        <ul>
            <li><a href="index.jsp">网站首页</a></li>
            <li><a href="jspinclude1.jsp">学校概况</a></li>
            <li><a href="jspinclude2.jsp">院系设置</a></li>
            <li><a href="forward.jsp">教育教学</a></li>
            <li><a href="info.jsp">科学研究</a></li>
            <li><a href="info.jsp">招生就业</a></li>
            <li><a href="info.jsp">合作交流</a></li>
            <li><a href="info.jsp">合作交流</a></li>
        </ul>
        <%
            String uname = request.getParameter("username");
            out.print(uname);
        %>
    </div>
</div>