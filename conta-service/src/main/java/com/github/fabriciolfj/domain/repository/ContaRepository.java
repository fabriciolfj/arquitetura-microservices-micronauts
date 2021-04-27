package com.github.fabriciolfj.domain.repository;

import com.github.fabriciolfj.domain.entities.Conta;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
