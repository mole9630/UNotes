<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言结果</title>
</head>
<body>
    处理 -> 声明 -> 获取数据 -> 判断数据是否为空并处理 -> 连接成字符串 -> 添加到向量空间 -> 保存 <br>
    <%!
       int i = 0;
       Vector<String> v = new Vector<String>();
    %>
    <%
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        // 获取系统时间
        Date date = new Date(); //方法1
        Date date1 = Calendar.getInstance().getTime(); //方法2
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String datetime = sdf.format(date1);

        //判断内容是否为空
        if (username == null || username.trim().equals("")){
            username = "游客" + (int) Math.random() * 1000 + 1000;
        }
        if (title == null || title.trim().equals("")){
            title = "无标题";
        }
        if (content == null || content.trim().equals("")){
            content = "无内容";
        }

        i ++;

        // 结果输出
        String str = "第" + i + "楼.用户名:" + username + ".标题:" + title +".内容:" + content + ".日期:" + datetime + "<br>";
        v.add(str); // 添加到向量空间
        application.setAttribute("massage", v);
    %>
    留言成功 <a href="messageBoard.jsp">返回留言板</a> | <a href="showMassage.jsp">查看留言板</a>
</body>
</html>
