package com.ionescu.radu.firsteeapp.controller;

import com.bethecoder.ascii_table.ASCIITable;
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
			ArrayList<String>  stringProducts = InvoiceParser.getInvoiceProductsStrings(getServletContext().getRealPath("/WEB-CONTENT/invoices/" + fileName));
			ArrayList<Product> products       = InvoiceParser.getProducts(stringProducts);

			String[]   tableHeaders = {"Brand", "SKU", "Name", "Color", "Size", "Quantity", "Price", "RON Price", "Total Price", "Color Code", "Composition", "Collection", "Origin"};
			String[][] tableContent = new String[products.size()][13];
			for(int i = 0 ; i < products.size() ; i++)
			{
				tableContent[i] = new String[]{products.get(i).getBrand(), products.get(i).getSKU(), products.get(i).getName(), products.get(i).getColor(), products.get(i).getSize(), products.get(i).getQuantity(), products.get(i).getPrice(), products.get(i).getPriceRON(), products.get(i).getPriceTotal(), products.get(i).getColorCode(), products.get(i).getComposition(), products.get(i).getCollection(), products.get(i).getOrigin()};
			}
			String table = ASCIITable.getInstance().getTable(tableHeaders, tableContent);
			request.setAttribute("table", table);
			request.setAttribute("products", products);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-CONTENT/view/pages/nir.jsp");
			dispatcher.forward(request, response);
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