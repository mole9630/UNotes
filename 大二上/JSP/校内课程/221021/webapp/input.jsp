<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入数据</title>
    <style>
        div {
            width: 500px;
            margin: 10px auto;
        }
    </style>
</head>
<body>
    <div>
        <form action="/CalulateServlet" method="post">
            第一个复数的实部:<input type="text" name="real1" placeholder="请输入第一个复数的实部"><br><br>
            第一个复数的虚部:<input type="text" name="imag1" placeholder="请输入第一个复数的虚部"><br><br>
            请选择运算符的类型:<select name="oper">
                <option value="+" selected="selected">+</option>
                <option value="-">-</option>
                <option value="*">×</option>
                <option value="/">÷</option>
            </select><br><br>
            第二个复数的实部:<input type="text" name="real2" placeholder="请输入第二个复数的实部"><br><br>
            第二个复数的虚部:<input type="text" name="imag2" placeholder="请输入第二个复数的虚部"><br><br>
            <input type="submit" value="计算">&nbsp;&nbsp;
            <input type="reset" value="重置">
        </form>
    </div>
</body>
</html>
