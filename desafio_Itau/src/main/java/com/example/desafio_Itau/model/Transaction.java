package com.example.desafio_Itau.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private double valor;
    private OffsetDateTime dataHora;
}
