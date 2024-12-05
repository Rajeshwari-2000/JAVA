<%@page import="com.demo.beans.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Book List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Available Books</h2>
    <table>
        <tr>
            <th>Id</th>
            <th>Book Name</th>
            <th>Author</th>
            <th>Price</th>
            <th>Category</th>
            <th>Select</th>
        </tr>
        <% 
        List<Book> ans = (List<Book>) request.getAttribute("Books");
        if (ans == null || ans.isEmpty()) { 
        %>
            <tr>
                <td colspan="6">No books available.</td>
            </tr>
        <% 
        } else { 
            for (Book b : ans) { 
        %>
            <tr>
                <td><%= b.getId() %></td>
                <td><%= b.getName() %></td>
                <td><%= b.getAuthorName() %></td>
                <td><%= b.getPrice() %></td>
                <td><%= b.getCat() %></td>
                <td>
                    <input id="chk<%= b.getId() %>" type="checkbox" name="btns" value="<%= b.getId() %>">
                </td>
            </tr>
        <% 
            } 
        } 
        %>
    </table>
    <form action="Total" method="post">
        <button type="submit">Get total</button> 
    </form>
    <a href="logout.html">Logout</a>
</body>
</html>