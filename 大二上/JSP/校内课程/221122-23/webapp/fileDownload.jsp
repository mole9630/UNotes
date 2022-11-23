<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update file</title>
</head>
<body>
    <div style="width: 400px; margin: 0 auto">
        <form action="/DownloadServlet" method="post">
            <label>下载的文件名:</label><input type="text" name="filename" placeholder="请输入文件名"><br><br>
            <input type="submit" value="下载">
        </form>
    </div>
</body>
</html>
