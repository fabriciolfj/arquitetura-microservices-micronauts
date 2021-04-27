package com.github.fabriciolfj.api.dto;

import io.micronaut.core.annotation.Introspected;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Introspected
public class ContaRequest {

    private String cliente;
    private String banco;
    private String numero;
}
