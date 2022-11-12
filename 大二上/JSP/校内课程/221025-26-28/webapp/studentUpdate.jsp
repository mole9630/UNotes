<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改数据</title>
</head>
<body>
    <div class="all">
        <div style="float: left;width: 400px">
            <jsp:include page="studentShow.jsp"></jsp:include>
        </div>
        <div style="float: right;width: 400px">
            <form action="/studentUpdateServlet" method="post">
                <table>
                    <tr>
                        <td>学号</td>
                        <td>
                            <input type="text" name="oldUserID" placeholder="请输入要修改的学号">
                        </td>
                    </tr>
                    <tr>
                        <td>新的学号</td>
                        <td>
                            <input type="text" name="newUserID" placeholder="请输入新的学号">
                        </td>
                    </tr>
                    <tr>
                        <td>新的姓名</td>
                        <td>
                            <input type="text" name="userName" placeholder="请输入新的姓名">
                        </td>
                    </tr>
                    <tr>
                        <td>请选择性别</td>
                        <td>
                            <select name="userSex">
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>新的生日</td>
                        <td>
                            <input type="text" name="userBirthday" placeholder="请输入新的生日">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="submit" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="reset" value="取消">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
