<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除数据</title>
</head>
<body>
    <div style="width: 500px;margin: 5px auto">
        <form action="/studentDeleteServlet" method="post">
            <div style="height: 100px">
                请选择要删除的方式：<br><br>
                <input type="radio" name="select" value="0" checked="checked">学号
                <input type="radio" name="select" value="1">姓名<br><br>
                <input type="text" name="userContent" placeholder="请输入要删除的对应信息"><br><br>
                <input type="submit" value="删除">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" value="取消">
            </div>
        </form>
    </div>
</body>
</html>
