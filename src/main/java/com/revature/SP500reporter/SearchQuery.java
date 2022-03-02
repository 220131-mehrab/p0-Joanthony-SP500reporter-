package com.revature.SP500reporter;


import javax.management.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SearchQuery {
    public void search(){
        //brings resource file into App to read/store. URI = uniform resource identifier
        URI uri = null;
        try {
            uri = App.class.getClassLoader().getResource("SP500financials.csv").toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        //create the file path in the system to get the csv
        Path filepath = Paths.get(uri);

        //read ALL lines and storing it into the string array
        List<String> stocks = null;
        try {
            stocks = Files.readAllLines(filepath, StandardCharsets.UTF_8);
        }  catch (IOException e) {
            e.printStackTrace();
        }
        //printing All lines in csv file
        //lines.forEach(System.out::println);


        //Search for specifics
        // for String Name in our list of line
        // if Name contains the searchQuery contents then print line
        String searchQuery = "MetLife Inc.";
        for (String Name : stocks) {
            if (Name.contains(searchQuery))
                System.out.println(Name);
        }

    }

}