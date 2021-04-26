<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.ecom.main.ProductController,com.ecom.model.Product, java.util.List, java.util.Iterator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flyaway</title>
<style>
#product {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
  margin-top: 40px;
}

#product td, #product th {
  border: 1px solid #ddd;
  padding: 8px;
}

#product tr:nth-child(even){background-color: #f2f2f2;}

#product tr:hover {background-color: #ddd;}

#product th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #3f51b5;/* #4CAF50; */
  color: white;
}


</style>
</head>
<body>
<h2>Product Table</h2>
<table id="product">
  <tr>
    <th>Product ID</th>
    <th>Product Name</th>
    <th>Product Price</th>    
  </tr>
  
  <% 	
  		ProductController productController = new ProductController();
  		List<Product> products = productController.getAllProducts();
  		for(Product p: products) {
  %>
	  <tr>
	    <td><%= p.getProductId() %></td>
	    <td><%= p.getProductName() %></td>
	    <td><%= p.getCost() %></td>
	  </tr>
  <%} %>
</table>
</body>
</html>