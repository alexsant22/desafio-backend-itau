package com.example.desafio_Itau.controller;

import com.example.desafio_Itau.dto.StatistcsResponse;
import com.example.desafio_Itau.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class StatistcsController {

    private final TransactionService service;

    public StatistcsController(TransactionService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<StatistcsResponse> getStatistcs() {
        DoubleSummaryStatistics stats = service.getStatistcs();
        return ResponseEntity.ok(new StatistcsResponse(stats));
    }
}
