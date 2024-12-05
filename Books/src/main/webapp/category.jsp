<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Select Category</title>
    <style type="text/css">
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; 
            margin: 0; 
            background-color: #f0f8ff; 
            font-family: Arial, sans-serif; 
        }

        form {
            background-color: white;
            border-radius: 15px; 
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1); 
            padding: 40px; 
            text-align: center; 
        }

        button {
            margin: 10px 0; 
            border-radius: 10px; 
            background-color: #007bff; 
            color: white; 
            width: 200px; 
            height: 40px; 
            border: none; 
            cursor: pointer; 
            transition: background-color 0.3s; 
            font-size: 16px; 
        }

        button:hover {
            background-color: #0056b3; 
        }
    </style>
</head>
<body>
    <form action="cata" method="post">
        <h2>Select a Category</h2>
        <button value="ad" name="btn" type="submit">Adventure</button><br>
        <button value="no" name="btn" type="submit">Novel</button><br>
        <button value="dr" name="btn" type="submit">Drama</button><br>
        <button value="fi" name="btn" type="submit">Fiction</button><br>
        <button value="action" name="btn" type="submit">Action</button><br>
        <button value="anime" name="btn" type="submit">Anime</button>
    </form>
</body>
</html>