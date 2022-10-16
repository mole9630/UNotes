<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>邮件发生</title>
</head>
<body>
  <form action="release.jsp" method="post">
    <table border="1px solid #c7edcc" align="center" width="600px">
      <caption>邮件发送</caption>
      <tr>
        <td>标题:</td>
        <td><input type="text" name="title" placeholder="请输入标题内容"></td>
      </tr>
      <tr>
        <td>内容:</td>
        <td><textarea name="content" cols="50" rows="16"></textarea></td>
      </tr>
      <tr>
        <td colspan="2"><input type="submit" value="发送"></td>
      </tr>
    </table>
  </form>
</body>
</html>
