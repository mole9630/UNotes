<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <div style="width: 500px; margin: 10px auto;"></div>
    <h2>注册</h2>
    <form action="show.jsp" method="post">
        <label for="u_name">姓名:</label><input type="text" name="u_name" id="u_name"><br><br>
        <label for="u_sex">性别:</label><select name="u_sex" id="u_sex">
            <option value="男">男</option>
            <option value="女">女</option>
        </select><br><br>
        <label for="u_phone">电话:</label><input type="tel" name="u_phone" id="u_phone"><br><br>
        <label for="u_email">邮件:</label><input type="email" name="u_email" id="u_email"><br><br>
        <label for="u_info">简介:</label><textarea rows="5" cols="30" name="u_info" id="u_info"></textarea><br><br>
        <label>爱好:</label>
            <input type="checkbox" name="u_hobby" value="音乐" id="music"><label for="music">音乐</label>&nbsp;
            <input type="checkbox" name="u_hobby" value="摄影" id="photography"><label for="photography">摄影</label>&nbsp;
            <input type="checkbox" name="u_hobby" value="绘画" id="paint"><label for="paint">绘画</label><br><br>
        <input type="submit" value="提交">&nbsp;&nbsp;<input type="reset" value="重置">
    </form>
</body>
</html>
