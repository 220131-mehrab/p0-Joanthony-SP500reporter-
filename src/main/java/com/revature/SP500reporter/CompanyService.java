package com.revature.SP500reporter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CompanyService extends HttpServlet {
    private ReporterRepository reporterRepository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userInput;
        userInput = req.getParameter("SearchCompany");
        if (userInput != null) {
            String result = reporterRepository.getCompany(userInput);
            resp.getWriter().println(result);
        } else {
            for (String company : reporterRepository.getStocks()) {
                resp.getWriter().println(company);
            }
        }
    }
    public CompanyService(ReporterRepository reporterRepository) {
        this.reporterRepository = reporterRepository;

}


