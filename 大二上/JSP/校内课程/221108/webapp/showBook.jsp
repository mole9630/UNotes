<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>图书显示</title>
</head>
<body>
    <jsp:useBean id="book" class="com.mole9630.Book" scope="page"></jsp:useBean>
    书号:${book.bookID}
    <br>
    书名:${book.bookName}

    <hr>
    修改书名为Java程序设计,重新显示
    <%
        book.setBookID("000" +
                "2");
        book.setBookName("Java程序设计");
    %>
    <hr>
    书号:${book.bookID}
    <br>
    书名:${book.bookName}
</body>
</html>
