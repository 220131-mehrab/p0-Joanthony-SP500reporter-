package com.revature.SP500reporter;

import org.apache.catalina.startup.Tomcat;

import java.sql.SQLOutput;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //UserDemo userDemo = new UserDemo();
        ReporterRepository reporterRepository = new ReporterRepository("SP500financials.csv");
        ReporterService reporterService = new ReporterService(reporterRepository);
        reporterRepository.getStocks();
        List<String> repolist = reporterRepository.getStocks();
        for (String stock: repolist ) {
            System.out.println(stock);
        }
        ReporterServer reporterServer = new ReporterServer(reporterService);
    }

}