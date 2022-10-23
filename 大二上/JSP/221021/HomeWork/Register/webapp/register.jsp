<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <style>
        div {
            width: 500px;
            margin: 10px auto;
        }
    </style>
</head>
<body>
<div>
    <form action="/RegisterServlet" method="post">
        用户名:<input type="text" name="userName"><br><br>
        性&nbsp;&nbsp;别:<input type="radio" name="userSex" value="男">男
            <input type="radio" name="userSex" value="女">女<br><br>
        出生年月:<input type="text" name="userBirthday"><br><br>
        民&nbsp;&nbsp;族:<input type="text" name="userEthnicity"><br><br>
        个人简介:<input type="text" name="userIntroduction"><br><br>
        <input type="submit" value="注册">&nbsp;&nbsp;<input type="reset" value="重置">
    </form>
</div>
</body>
</html>
