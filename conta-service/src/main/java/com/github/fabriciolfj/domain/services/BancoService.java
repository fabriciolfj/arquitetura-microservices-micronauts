package com.github.fabriciolfj.domain.services;

import com.github.fabriciolfj.domain.entities.Banco;
import com.github.fabriciolfj.domain.exceptions.BancoNotFoundException;
import com.github.fabriciolfj.domain.repository.BancoRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class BancoService {

    private final BancoRepository bancoRepository;

    public Banco findCode(@NonNull final String code) {
        return bancoRepository.findByCode(code)
                .orElseThrow(() -> new BancoNotFoundException("Banco não localizado para o código " + code));
    }


}
