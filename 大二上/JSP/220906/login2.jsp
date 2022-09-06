<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/9/6
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="css/reg.css">
</head>
<body>
    Hello, 这里是登录页面
    <!-- 主体窗体 -->
    <div id="form-div">
        <form id="reg-form" action="">
            <table>
                <tr>
                    <td>用户名</td>
                    <td>
                        <input type="text" name="uid" id="uid" value="" placeholder="请输入用户名" required="required" />
                    </td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td>
                        <input type="password" name="pwd" id="pwd" value="" placeholder="请输入密码" required="required" />
                    </td>
                </tr>
            </table>
            <div class="buttons">
                <input type="submit" value="登录" style="margin-right: 20px;margin-top: 20px;" />
                <a href="reg.jsp"><input type="button" value="没有账号?去注册" style="margin-right: 45px;margin-top: 20px;" /></a>
            </div>
            <br class="clear">
        </form>
    </div>
</body>
</html>