package com.example.desafio_Itau.service;

import com.example.desafio_Itau.model.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

@Service
public class TransactionService {

    private final Queue<Transaction> transactions = new ConcurrentLinkedDeque<>();

    public void addTransaciton(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransaction() {
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistcs() {
        OffsetDateTime now = OffsetDateTime.now();

        return transactions.stream()
                .filter(f -> f.getDataHora().isAfter(now.minusSeconds(60)))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }
}
