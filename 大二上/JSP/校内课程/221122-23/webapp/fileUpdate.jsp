<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update file</title>
</head>
<body>
    <div style="width: 400px; margin: 0 auto">
        <form action="/UploadServlet" method="post" enctype="multipart/form-data">
            <label>上传者:</label><input type="text" name="username" placeholder="请输入上传者名"><br><br>
            <label>请选择上传的文件:</label><input type="file" name="file"><br><br>
            <input type="submit" value="上传">
        </form>
    </div>
</body>
</html>
