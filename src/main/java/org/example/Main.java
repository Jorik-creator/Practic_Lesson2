package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "https://informer.com.ua/dut/java/pr2.csv";
        DataReader dataReader = new TransactionCSVReader();
        List<String[]> data = dataReader.readData(filePath);

        TransactionProcessor processor = new TransactionProcessor();
        List<Transaction> transactions = processor.processTransactions(data);

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
