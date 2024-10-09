package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TransactionCSVReader implements DataReader {
    @Override
    public List<String[]> readData(String source) {
        List<String[]> transactions = new ArrayList<>();
        try {
            URL url = new URL(source);
            try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    transactions.add(values);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading data from URL: " + e.getMessage());
        }
        return transactions;
    }
}
