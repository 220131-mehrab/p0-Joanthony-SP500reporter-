package com.revature.SP500reporter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ReporterService extends HttpServlet {
    private ReporterRepository reporterRepository;

    public ReporterService(ReporterRepository reporterRepository) {
        this.reporterRepository = reporterRepository;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (String stocks : reporterRepository.getStocks()) {
            resp.getWriter().println(stocks);
        }
    }
}
