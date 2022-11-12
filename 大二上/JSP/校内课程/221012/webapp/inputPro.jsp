<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>输入数据</title>
</head>
<body>
    <form action="sumPro.jsp" method="post">
        第一个数据:<input type="text" name="data1" placeholder="请输入第一个数据"><br><br>
        <select name="operator">
            <option value="0" selected="selected">+</option>
            <option value="1">-</option>
            <option value="2">*</option>
            <option value="3">/</option>
        </select><br><br>
        第二个数据:<input type="text" name="data2" placeholder="请输入第二个数据"><br><br>
        <input type="submit" value="计算">
    </form>
</body>
</html>
