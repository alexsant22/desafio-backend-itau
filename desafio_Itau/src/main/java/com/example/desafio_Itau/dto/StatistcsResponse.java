package com.example.desafio_Itau.dto;

import lombok.Data;

import java.util.DoubleSummaryStatistics;

@Data
public class StatistcsResponse {

    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;

     public StatistcsResponse(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }
}
