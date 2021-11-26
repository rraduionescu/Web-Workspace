package com.ionescu.radu.firsteeapp.controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "homeServlet")
public class HomeServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        response.setContentType("text/html");
    }
}