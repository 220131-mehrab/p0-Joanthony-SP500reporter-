package com.revature.SP500reporter;

import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        UserDemo userDemo = new UserDemo();
        ReporterRepository reporterRepository = new ReporterRepository("SP500finacials.csv");


        Tomcat server = new Tomcat();
        server.getConnector();
        server.addContext("",null);
        //server.addServlet("","defaultServlet",new ReporterRepository()).addMapping("/reporter");

    }

}