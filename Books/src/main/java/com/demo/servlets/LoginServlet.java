package com.demo.servlets;

import java.io.IOException;

import com.demo.service.BookService;
import com.demo.service.BookServicesImpl;
import com.demo.service.Login;
import com.demo.service.LoginImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		Login lo = new LoginImpl();
		boolean result = lo.getUser(username,password);
		if(result) {
			RequestDispatcher rd = req.getRequestDispatcher("category.jsp");
			rd.forward(req, res);
		}
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.forward(req, res);
		
	}
}
