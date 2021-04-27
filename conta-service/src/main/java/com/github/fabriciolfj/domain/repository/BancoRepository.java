package com.github.fabriciolfj.domain.repository;

import com.github.fabriciolfj.domain.entities.Banco;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long> {

    Optional<Banco> findByCode(final String code);
}
