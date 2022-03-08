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
        Scanner scanner = new Scanner(this.file,"UTF-8");
        scanner.useDelimiter("\n");
    try {
        while (scanner.hasNext()) {
            this.stocks.add(scanner.next());


        }
    }
    catch(NullPointerException e) {
        e.printStackTrace();
    }
    }

    public List<String> getStocks() {
        return this.stocks;
    }

        //printing All lines in csv file
        //stocks.forEach(System.out::println);

    public ReporterRepository(){

    }


    //}

}