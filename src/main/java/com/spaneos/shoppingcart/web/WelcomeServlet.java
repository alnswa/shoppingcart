package com.spaneos.shoppingcart.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/viewnames")
public class WelcomeServlet extends HttpServlet {
		
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
					req.setAttribute("names", "Lakshman,Manoj,Rajesh,Krish,Balu,Don");
					req.getRequestDispatcher("viewnames.jsp").forward(req, resp);
			}
}
