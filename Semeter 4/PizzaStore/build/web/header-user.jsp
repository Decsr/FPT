<%-- 
    Document   : header
    Created on : Jun 11, 2023, 4:25:09 PM
    Author     : Nguyen Thanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>JSP Page</title>
        <link rel="stylesheet" href="./asset/styles.css">
    
    </head>
    <body>
        <div id="header">
          
            <nav>
                <ul id="main-menu">
                    <li>
                        <a href="./home"><image src="https://scontent.fsgn5-11.fna.fbcdn.net/v/t1.15752-9/431532203_783873163092717_8112718023163948451_n.png?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHql7_h9Wx_qIrRiAP7N6cyeSqBkG9IoW15KoGQb0ihbVXmamdyz25PEx57uJyRvxs-bOYlZiyZwXjkpQ7l_yuV&_nc_ohc=7IOIcLd9qAkAX_O51Zg&_nc_ht=scontent.fsgn5-11.fna&oh=03_AdTyWwHaWbGUFvqiV7TAZxQ4Yt_CBGWW11BJwse2USjFAw&oe=6616597D"/></a>
                    </li>
                  
                    <li>
                        <a href="./my-order?accountId=${sessionScope.account.username}">My Orders</a>
                    </li>
                      <li>
                        <a href="./home">Pizzas List</a>
                    </li>

                </ul>

                <div class="header_login">
                    <c:if test="${sessionScope.account == null}">
                        
                        <a href="register.jsp">Register</a>
                        /
                        <a href="login.jsp">Login</a>
                    </c:if>
                        <c:if test="${sessionScope.account != null}">
                            Welcome, <a href="account"> ${sessionScope.account.username}</a>
                            /
                            <a href="./logout">Logout</a>
                            
                        </c:if>
                </div>
            </nav>
        </div>
        
        <script>
        $(document).ready(function () {
            $('#toggle').click(function () {
                $('nav').slideToggle();
            })
        })
        </script>
    </body>
</html>
