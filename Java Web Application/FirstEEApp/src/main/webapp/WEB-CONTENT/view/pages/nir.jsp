<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ionescu.radu.firsteeapp.model.classes.Product" %><%--
  Created by IntelliJ IDEA.
  User: IonescuRadu
  Date: 29.11.2021
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>NIR</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/WEB-CONTENT/view/styles/style.css"/>
    </head>
    <body>
        <div id="logo">
            <a href="home">
                <img src="${pageContext.request.contextPath}/WEB-CONTENT/view/images/logo.png" id="logo_image">
            </a>
        </div>
        <h3>
            NIR
        </h3>
        <br>
        <div id="sql_div">
            <textarea rows="200" cols="300" id="statement" name="statement"><%=request.getAttribute("table")%></textarea><br>
        </div>
    <table>
        <thead>
            <th>#</th>
            <th>Brand</th>
            <th>SKU</th>
            <th>Name</th>
            <th>Color</th>
            <th>Size</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>RON Price</th>
            <th>Total Price</th>
            <th>Color Code</th>
            <th>Composition</th>
            <th>Collection</th>
            <th>Origin</th>
        </thead>
        <tbody>
        <%
        ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
        int i=1;
		for(Product product : products)
        {%>
        <tr>
            <td><%=i%></td>
            <td><%=product.getBrand()%></td>
            <td><%=product.getSKU()%></td>
            <td><%=product.getName()%></td>
            <td><%=product.getColor()%></td>
            <td><%=product.getSize()%></td>
            <td><%=product.getQuantity()%></td>
            <td><%=product.getPrice()%></td>
            <td><%=product.getPriceRON()%></td>
            <td><%=product.getPriceTotal()%></td>
            <td><%=product.getColorCode()%></td>
            <td><%=product.getComposition()%></td>
            <td><%=product.getCollection()%></td>
            <td><%=product.getOrigin()%></td>
        </tr>
        <%
        i++;
		}
        %>
        </tbody>
    </table>
    </body>
</html>