package com.revature.SP500reporter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<HTML>\n" +
                "<Head>\n" +
                "    <Title>Search S&P500 Reporter" +
                "</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "      <form action='/' method = 'get'>\n" +
                "        <input type='name' name = 'Search'>\n" +
                "        <input type='submit' value='Search'/>  \n" +
                "      " +
                "</form>\n" +
                "</Body>\n" +
                "</HTML>";
    resp.getWriter().println(HTMLForm);
    }




}
