package com.github.fabriciolfj.domain.repository;

import com.github.fabriciolfj.domain.entities.Extrato;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface ExtratoRepository extends JpaRepository<Extrato, Long> {
}
