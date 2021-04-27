package com.github.fabriciolfj.domain.exceptions;

public class BancoNotFoundException extends RuntimeException {

    public BancoNotFoundException(final String msg) {
        super(msg);
    }
}
