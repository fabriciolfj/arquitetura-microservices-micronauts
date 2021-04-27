package com.github.fabriciolfj.domain.entities;

import io.micronaut.data.annotation.Join;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "extrato")
public class Extrato {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;
    @Column(name = "data")
    private LocalDateTime data;
    @Column(name = "saldo")
    private BigDecimal saldo;
    @Column(name = "operacao")
    private String operacao;
    @Column(name = "valor")
    private BigDecimal valor;
}
