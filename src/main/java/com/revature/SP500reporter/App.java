package com.revature.SP500reporter;


import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {

    public static void main(String[] args) {
        double netBalance = 5000;
        double availableCash = 260.55;
        System.out.println("Your portfolio net balance:" + " " + netBalance + "\n" + "Your available cash:" + " " + availableCash);
        //brings resource file into App to store. URI = uniform resource identifier
        URI uri = null;
        try {
            uri = App.class.getClassLoader().getResource("SP500financials.csv").toURI();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        //create the file path in the system to get the csv
        Path filepath = Paths.get(uri);
        //Declaring lines variable
        List<String> lines = null;
        //read all lines and storing it into the string array
        try {
            lines = Files.readAllLines(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //lines.forEach(System.out::println);
        String searchQuery = "Accenture";
        for (String Name : lines) {
            if (Name.contains(searchQuery))
                System.out.println(Name);

        }
    }
}


