<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据输入</title>
    <style>
        div {
            width: 500px;
            margin: 10px auto;
        }
    </style>
</head>
<body>
    <div>
        <form action="/CircleServlet" method="post">
            圆的半径:<input type="text" name="r" placeholder="请输入圆的半径"><br><br>
            请选择计算的类型:<select name="oper">
                <option value="all" selected="selected">周长与面积</option>
                <option value="circumference">仅周长</option>
                <option value="area">仅面积</option>
            </select><br><br>
            <input type="submit" value="计算">&nbsp;&nbsp;<input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
