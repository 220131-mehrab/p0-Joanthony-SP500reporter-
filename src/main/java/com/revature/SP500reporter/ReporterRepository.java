package com.revature.SP500reporter;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReporterRepository {
    private List<String> stocks;
    private InputStream file;

    public ReporterRepository(String filename) {
        this.stocks = new ArrayList<>();
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.stocks.add(scanner.next());
        }
    }

    public List<String> getStocks() {
        return this.stocks;
    }

    public String getStock(String userInput) {
        String result = "";
        for (String stock : this.stocks){
            if (stock.contains(userInput)) {
                result = userInput;
            }
        }
        return result;
    }

    public String getCompany(String userInput) {
        String result = "";
        for (String company : this.stocks){
            if (company.contains(userInput)) {
                result = userInput;
            }
        }
        return result;
    }





        //printing All lines in csv file
        //stocks.forEach(System.out::println);

    public ReporterRepository(){

    }
}