package com.revature.SP500reporter;

import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        UserDemo userDemo = new UserDemo();
        ReporterRepository reporterRepository = new ReporterRepository("SP500finacials.csv");
        ReporterService reporterService = new ReporterService(reporterRepository);
        ReporterServer reporterServer = new ReporterServer(reporterService);

    }

}