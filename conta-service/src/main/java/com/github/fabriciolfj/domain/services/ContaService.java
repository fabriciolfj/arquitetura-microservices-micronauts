package com.github.fabriciolfj.domain.services;

import com.github.fabriciolfj.domain.entities.Conta;
import com.github.fabriciolfj.domain.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Singleton;

@Singleton
@RequiredArgsConstructor
public class ContaService {

    private final ContaRepository contaRepository;
    private final BancoService bancoService;

    @Transactional(propagation = Propagation.REQUIRED)
    public Conta save(final Conta conta, final String code) {
        conta.setBanco(bancoService.findCode(code));
        return contaRepository.save(conta);
    }

}
