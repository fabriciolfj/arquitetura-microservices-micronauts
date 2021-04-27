package com.github.fabriciolfj.domain.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero", length = 10, nullable = true)
    private String numero;
    @ManyToOne
    @JoinColumn(name = "banco_id")
    private Banco banco;
    @Column(name = "cliente", nullable = true, length = 14)
    private String cliente;
    @OneToMany(mappedBy = "conta")
    private List<Extrato> extratos;

}
