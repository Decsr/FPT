<%-- 
    Document   : register
    Created on : Feb 25, 2024, 4:10:43 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Company</title>
        <style>
            body {
                font-family: 'Roboto', sans-serif;
                margin: 0;
                padding: 0;
                background-color: #fff; /* Creamy color for a warm feel */
            }

            .container {
                width: 80%;
                margin: 0 auto;
                padding: 20px;
            }

            h1 {
                text-align: center;
                color: #e64a19; /* Dark orange color for a pizza theme */
            }

            form {
                text-align: center;
                margin-bottom: 20px;
            }

            input[type="text"],
            input[type="submit"] {
                padding: 10px;
                border: none;
                border-radius: 5px;
                margin-right: 10px;
            }

            input[type="submit"] {
                background-color: #e64a19; /* Dark orange color for a pizza theme */
                color: white;
                cursor: pointer;
            }

            table {
                width: 100%;
                border-collapse: collapse;
            }

            table th,
            table td {
                padding: 10px;
                text-align: left;
                border-bottom: 1px solid #ddd;
            }

            table th {
                background-color: #004666; 
                color: white;
            }

            table tr:hover {
                background-color: #f2f2f2; /* Lighter shade of orange on hover */
            }

            img {
                display: block;
                margin: 0 auto;
            }

            footer {
                text-align: center;
                padding: 20px;
                background-color: #e64a19; /* Dark orange color for footer */
                color: white;
                position: fixed;
                bottom: 0;
                width: 100%;
            }
        </style>

    </head>
    <body>
        <%@include file="header-user.jsp" %>
        <br/>
        <h1>Domino Xoxo</h1>
        <br/>
        <form method="get" action="./home" style="float:left">
            <input type="text" name="search" value="${param.search}" style="width: 200px; border: 1px solid #333" placeholder="Find pizza">
            <input type="submit" value="Go" style="color: white; background: #c0392b; padding: 10px; border-radius: 5px">
        </form>
            
            <br/>
            <image src="https://img.dominos.vn/BANNER+70+SING+(3).jpg" style="width: 80%"/>
        <br/>
    <th:if test="${message != null}">
        <p>${message}</p>
    </th:if>
    <th:if test="${pizzas != null}">
        <br/>
        <table>
            <tr >
                <th>Name</th>
                <th>Price</th>
                <th>Description</th>
                <th>Image Url</th>
                <th>Category</th>
                <th></th>
            </tr>
            <c:forEach items="${pizzas}" var="pizza">
                <tr style="border-bottom: #777777 1px solid">
                    <!--<td style="padding: 5px 10px;">${pizza.productId}</td>-->
                    <td style="padding: 5px 10px;">${pizza.productName}</td>
                    <td style="padding: 5px 10px;">$${pizza.unitPrice}</td>
                    <td style="padding: 5px 10px;">${pizza.category.description}</td>
                    <td style="padding: 5px 10px;">
                        <img src="${pizza.productImage}" width="100" height="100" alt="Image" />
                    </td>
                    <td style="padding: 5px 10px;">${pizza.category.categoryName}</td>
                    <td>
                        <form method="get" action="./order">
                            <input type="hidden" name="productId" value="${pizza.productId}">
                            <input type="hidden" name="productName" value="${pizza.productName}">
                            <input type="hidden" name="unitPrice" value="${pizza.unitPrice}">
                            <input type="hidden" name="quantity" value="1">
                            <input type="submit" value="Place Order" style="color: white; background: orange; padding: 5px; border-radius: 5px">
                        </form>
                    </td>
                </tr>

            </c:forEach>
        </table>
    </th:if>
    <br/>


</body>
</html>
