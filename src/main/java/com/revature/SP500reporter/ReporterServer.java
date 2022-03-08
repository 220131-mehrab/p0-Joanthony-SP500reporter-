package com.revature.SP500reporter;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class ReporterServer {
    private Tomcat server;
    public ReporterServer(ReporterService reporterService) {
        this.server = new Tomcat();
        this.server.getConnector();
        this.server.addContext("",null);
        this.server.addServlet("","reporterServlet", reporterService).addMapping("/");
        try {
            this.server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
