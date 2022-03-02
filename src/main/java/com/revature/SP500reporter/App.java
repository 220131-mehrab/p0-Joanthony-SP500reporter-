package com.revature.SP500reporter;


import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String fName = "Forest";
        String lName = "Whitacker";
        String companyName = "Sicilian Capital";
        double indivAcctBalance = 5000;
        double availableCash = 260.55;
        System.out.println( "Welcome back to" + " " + companyName + "," + "Mr." + lName + "!");
        System.out.println("\n" + "Your individual account balance is:" + " " + indivAcctBalance + "\n" + "Your available cash:" + " " + availableCash
            + "\n");


        SearchQuery searchQuery = new SearchQuery();
        searchQuery.search();

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