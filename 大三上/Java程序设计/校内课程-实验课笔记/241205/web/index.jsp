<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="service.ProductService" %>
<%@ page import="bean.Product" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
<h1>商品列表</h1>
<%
    ProductService productService = new ProductService();
    List<Product> products = productService.getAllProducts();
%>
<table border="1">
    <tr>
        <th>ID</th>
        <th>名称</th>
        <th>价格</th>
        <th>库存</th>
    </tr>
    <%
        for (Product product : products) {
    %>
    <tr>
        <td><%= product.getId() %></td>
        <td><%= product.getName() %></td>
        <td><%= product.getPrice() %></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
