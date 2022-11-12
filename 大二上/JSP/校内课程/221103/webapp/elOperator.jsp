<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>运算符</title>
    <style>
        th,td {
            width: 150px;
            text-align: center;
            border: 1px solid #c7edcc;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>运算符</th>
            <th>表达式</th>
            <th>计算结果</th>
            <th>备注</th>
        </tr>

        <tr>
            <td> + </td>
            <td> \${5 + "100"} </td>
            <td> ${5 + "100"}</td>
            <td> 加法 </td>
        </tr>

        <tr>
            <td> / </td>
            <td> \${5 / 2} </td>
            <td> ${5 / 2}</td>
            <td> 除法 </td>
        </tr>
        <tr>
            <td> div </td>
            <td> \${5 div 2} </td>
            <td> ${5 div 2}</td>
            <td> 除法 </td>
        </tr>
        <tr>
            <td> / </td>
            <td> \${5 / 0} </td>
            <td> ${5 / 0}</td>
            <td> 除法 </td>
        </tr>

        <tr>
            <td> % </td>
            <td> \${5 % 2} </td>
            <td> ${5 % 2}</td>
            <td> 取余 </td>
        </tr>
        <tr>
            <td> mod </td>
            <td> \${5 mod 2} </td>
            <td> ${5 mod 2}</td>
            <td> 取余 </td>
        </tr>

        <tr>
            <td> and / &&</td>
            <td> \${true and false} </td>
            <td> ${true and false}</td>
            <td> 逻辑与 </td>
        </tr>

        <tr>
            <td> > / gt </td>
            <td> \${5 gt 3} </td>
            <td> ${5 gt 3}</td>
            <td> 大于 </td>
        </tr>

        <tr>
            <td> = / eq </td>
            <td> \${"123" eq 123} </td>
            <td> ${"123" eq 123}</td>
            <td> 判断是否相等 </td>
        </tr>

        <tr>
            <td> ? : </td>
            <td> \${3>2 ? 3 : 2} </td>
            <td> ${3>2 ? 3 : 2}</td>
            <td> 三目表达式 </td>
        </tr>


        <tr>
            <td> empty </td>
            <td> \${empty "123"} </td>
            <td> ${empty "123"}</td>
            <td> 判断是否为空 </td>
        </tr>
        <tr>
            <td> empty </td>
            <td> \${empty ""} </td>
            <td> ${empty ""}</td>
            <td> 判断是否为空 </td>
        </tr>
        <tr>
            <td> empty </td>
            <td> \${empty "null"} </td>
            <td> ${empty "null"}</td>
            <td> 判断是否为空 </td>
        </tr>

    </table>
</body>
</html>
