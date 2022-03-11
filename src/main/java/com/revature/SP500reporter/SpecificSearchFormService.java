package com.revature.SP500reporter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SpecificSearchFormService extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<HTML>\n" +
                "<Head>\n" +
                "    <Title>Search S&P500 Reporter" +
                "</Title>\n" +
                "</Head>\n" +
                "<Body>\n" +
                "      <form action='/SearchCompany' method = 'get'>\n" +
                "        <input type='name' name = 'SearchCompany'>\n" +
                "        <input type='submit' value='Search Company'/>  \n" +
                "      " +
                "</form>\n" +
                "</Body>\n" +
                "</HTML>";
        resp.getWriter().println(HTMLForm);
    }
}