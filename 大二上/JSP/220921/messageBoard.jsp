<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
    <style>
        .d1{
            width: 500px;
            margin: 0 auto;
            /*border: 3px solid #c7edcc;*/
            /*background: #c7edcc;*/
            padding: 20px;
        }
        textarea{
            resize: none
        }
    </style>
</head>
<body>
    <div class="d1">
        <form action="checkMessage.jsp" method="post">
            用户名:<input type="text" name="username" placeholder="请输入用户名"/><br />
            标 &nbsp; 题:<input type="text" name="title" placeholder="请输入标题"/><br />
            内 &nbsp; 容:<textarea cols="58" rows="7" name="content" placeholder="请输入内容"></textarea><br /><br />
            <input type="submit" value="提交" /> &nbsp;&nbsp;&nbsp;
            <input type="reset" value="重置" />
        </form>
        <hr>
        <form action="showMassage.jsp" method="post">
            <input type="submit" value="查看留言">
        </form>
    </div>
</body>
</html>
