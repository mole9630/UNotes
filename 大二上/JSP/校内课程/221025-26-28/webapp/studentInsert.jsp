<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加信息</title>
</head>
<body>
    <div style="width: 500px; margin: 5px auto">
        <form action="/studentInsertServlet" method="post">
            <table style="height: 260px">
                <tr>
                    <td>学号</td>
                    <td>
                        <input type="text" name="userID" placeholder="请输入学号">
                    </td>
                </tr>

                <tr>
                    <td>姓名</td>
                    <td>
                        <input type="text" name="userName" placeholder="请输入姓名">
                    </td>
                </tr>

                <tr>
                    <td>性别</td>
                    <td>
                        <select name="userSex">
                            <option>男</option>
                            <option>女</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>生日</td>
                    <td>
                        <input type="date" name="userBirthday" placeholder="请输入生日">
                    </td>
                </tr>

                <tr>
                    <td colspan="2">
                        <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="取消">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
