package com.revature.SP500reporter;

import java.util.List;

public class UserDemo {
    public UserDemo() {
        ReporterRepository reporterRepository = new ReporterRepository("SP500financials.csv");
        List<String> stocks = reporterRepository.getStocks();
        String fName = "Forest";
        String lName = "Whitacker";
        String companyName = "Sicilian Capital";
        double indivAcctBalance = 5000;
        double availableCash = 260.55;
        System.out.println( "Welcome back to" + " " + companyName + "," + "Mr." + lName + "!");
        System.out.println("\n" + "Your individual account balance is:" + " " + indivAcctBalance + "\n" + "Your available cash:" + " " + availableCash
                + "\n");

        //Search for specifics
        //for String Name in our list of line
        // Name contains the searchQuery contents then print line
        String searchQuery = "MetLife Inc.";
        for (String Name : stocks) {
            if (Name.contains(searchQuery))
                System.out.println(Name);
        }
        double price = 44.28;
        double budgetPerCompany = 50.00;
        boolean potentialInvestment = price <= budgetPerCompany;
        if (potentialInvestment) {
            System.out.println("\n" + "This company is in your budget!" + "\n" + "Would you like to look at the financial history?");
        } else {
            System.out.println("\n" + "This company is not in your budget");
        }

    }


}
