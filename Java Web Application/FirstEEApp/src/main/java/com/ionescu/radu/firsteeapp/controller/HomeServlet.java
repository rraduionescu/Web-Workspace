package com.ionescu.radu.firsteeapp.controller;

import com.ionescu.radu.firsteeapp.model.DBUsers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "homeServlet")
public class HomeServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        PrintWriter pr = response.getWriter();
        pr.println(DBUsers.getUsers());
        //request.setAttribute("output", "ThisIsTheOutput");
        //RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
        //dispatcher.forward(request, response);
    }
}