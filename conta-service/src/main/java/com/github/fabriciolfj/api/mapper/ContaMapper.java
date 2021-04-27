package com.github.fabriciolfj.api.mapper;

import com.github.fabriciolfj.api.dto.ContaRequest;
import com.github.fabriciolfj.api.dto.ContaResponse;
import com.github.fabriciolfj.domain.entities.Conta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "jsr330")
public interface ContaMapper {

    @Mapping(target = "banco", ignore = true)
    @Mapping(target = "extratos", ignore = true)
    Conta toEntity(final ContaRequest contaRequest);

    ContaResponse toResponse(final Conta conta);
}
