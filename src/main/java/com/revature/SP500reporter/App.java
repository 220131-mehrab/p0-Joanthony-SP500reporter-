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
        double netBalance = 5000;
        double availableCash = 260.55;
        System.out.println("Your portfolio net balance:" + " " + netBalance + "\n" + "Your available cash:" + " " + availableCash);

        SearchQuery searchQuery = new SearchQuery();
        searchQuery.search();
    }

}