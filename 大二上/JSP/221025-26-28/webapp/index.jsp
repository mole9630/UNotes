<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息管理系统</title>
    <link type="text/css" rel="stylesheet" href="css/index.css">
    <script type="text/javascript" src="js/jquery-3.6.1.min.js"></script>
    <script>
        $(document).ready(function (){
           $(".uleft li").each(function (index){
               $(this).click(function (){
                  $(".d0, .d1, .d2, .d3, .d4").css("display", "none");
                   $(".d" + index).css("display", "block");
                   $(".uleft li").removeClass("current");
                   $(".uleft li:eq(" + index + ")").addClass("current");
               });
           });
        });
    </script>
</head>
<body>
    <div class="top">
        <h1>学生信息管理系统</h1>
    </div>
    <div class="content">
        <div class="content-left">
            <ul class="uleft">
                <li class="current">学生信息预览</li>
                <li>查询学生信息</li>
                <li>增加学生信息</li>
                <li>修改学生信息</li>
                <li>删除学生信息</li>
            </ul>
        </div>
        <div class="content-right">
            <div class="d0">0</div>
            <div class="d1">1
                <jsp:include page="studentShow.jsp"></jsp:include></div>
            <div class="d2">
                <jsp:include page="studentInsert.jsp"></jsp:include>
            </div>
            <div class="d3">3</div>
            <div class="d4">
                <jsp:include page="studentDelete.jsp"></jsp:include>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</body>
</html>
