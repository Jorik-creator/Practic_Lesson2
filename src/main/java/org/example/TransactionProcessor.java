package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransactionProcessor {
    public List<Transaction> processTransactions(List<String[]> data) {
        List<Transaction> transactions = new ArrayList<>();
        for (String[] values : data) {
            Transaction transaction = new Transaction(values[0], Double.parseDouble(values[1]), values[2]);
            transactions.add(transaction);
        }
        return transactions;
    }
}
