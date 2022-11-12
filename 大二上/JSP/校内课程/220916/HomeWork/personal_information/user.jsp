<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="show.jsp" method="post">
        用户名：<input type="text" name="username" required="required" >(必填)<br>
        密码：<input type="password" name="userPwd" required="required" >(必填)<br>
        确认密码：<input type="password" name="reUserPwd"><br>
        性别：<input type="radio" name="sex" value="男">男<input type="radio" name="sex" value="女" >女<br>
        爱好：<input type="checkbox" name="hobby" value="旅行">旅行
        <input type="checkbox" name="hobby" value="乐器">乐器
        <input type="checkbox" name="hobby" value="收藏">收藏
        <input type="checkbox" name="hobby" value="摄影">摄影
        <input type="checkbox" name="hobby" value="天文">天文
        <input type="checkbox" name="hobby" value="运动">运动<br>
        星座：<select name="constellation" >
            <option name="星座" value="狮子座">狮子座</option>
            <option name="星座" value="天秤座">天秤座</option>
            <option name="星座" value="双子座">双子座</option>
            <option name="星座" value="处女座">处女座</option>
            <option name="星座" value="金牛座">金牛座</option>
            <option name="星座" value="摩羯座">摩羯座</option>
            <option name="星座" value="天蝎座">天蝎座</option>
            <option name="星座" value="天蝎座">射手座</option>
            <option name="星座" value="白羊座">白羊座</option>
            <option name="星座" value="水瓶座">水瓶座</option>
            <option name="星座" value="双鱼座">双鱼座</option>
            <option name="星座" value="巨蟹座">巨蟹座</option>
        </select><br>
        个人简介：<textarea name="introduction" cols="30" rows="5"></textarea><br>
        <input type="submit" value="提交">
        <input type="reset" value="重置" >
    </form>
</body>
</html>
