<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Online Shopping Cart</title>
</head>
<body>
<h2>Bill Details</h2>
<%
    int laptopPrice = 50000;
    int mobilePrice = 20000;
    int headphonePrice = 2000;

    int laptopQty = Integer.parseInt(request.getParameter("laptop"));
    int mobileQty = Integer.parseInt(request.getParameter("mobile"));
    int headphoneQty = Integer.parseInt(request.getParameter("headphone"));

    int laptopTotal = laptopPrice * laptopQty;
    int mobileTotal = mobilePrice * mobileQty;
    int headphoneTotal = headphonePrice * headphoneQty;

    int grandTotal = laptopTotal + mobileTotal + headphoneTotal;
%>
<table border="1">
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Total</th>
    </tr>
    <tr>
        <td>Laptop</td>
        <td><%= laptopPrice %></td>
        <td><%= laptopQty %></td>
        <td><%= laptopTotal %></td>
    </tr>
    <tr>
        <td>Mobile</td>
        <td><%= mobilePrice %></td>
        <td><%= mobileQty %></td>
        <td><%= mobileTotal %></td>
    </tr>
    <tr>
        <td>Headphone</td>
        <td><%= headphonePrice %></td>
        <td><%= headphoneQty %></td>
        <td><%= headphoneTotal %></td>
    </tr>
    <tr>
        <th colspan="3">Grand Total</th>
        <th><%= grandTotal %></th>
    </tr>
</table>
</body>
</html>