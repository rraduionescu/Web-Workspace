package com.ionescu.radu.firsteeapp.controller;

import com.ionescu.radu.firsteeapp.model.classes.InvoiceParser;
import com.ionescu.radu.firsteeapp.model.classes.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "NirServlet", value = "/NirServlet")
public class NirServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			String             fileName       = request.getParameter("file");
			ArrayList<String>  stringProducts = InvoiceParser.getInvoiceProductsStrings(getServletContext().getContextPath());
			ArrayList<Product> products       = InvoiceParser.getProducts(stringProducts);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}
}