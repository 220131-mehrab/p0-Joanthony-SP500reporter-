package com.revature.SP500reporter;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class ReporterServer {


    private Tomcat server;
    SearchFormService sfService = new SearchFormService();
    SpecificSearchFormService ssfService = new SpecificSearchFormService();
    CompanyService companyService = new CompanyService(reporterRepository);
    public ReporterServer(ReporterService reporterService) {
        this.server = new Tomcat();
        this.server.setBaseDir(System.getProperty("java.io.tmpdir"));
        this.server.setPort(8080);
        this.server.getConnector();
        this.server.addContext("",null);
        this.server.addServlet("","reporterServlet", reporterService).addMapping("/");
        this.server.addServlet("", "SpecificSearchFormService",companyService ).addMapping("/SearchCompany");
        this.server.addServlet("", "SearchFormService", sfService).addMapping("/search");
        try {
            this.server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

    }
}
