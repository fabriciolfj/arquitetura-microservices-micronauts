package com.github.fabriciolfj.api.controller;

import com.github.fabriciolfj.api.dto.ContaRequest;
import com.github.fabriciolfj.api.mapper.ContaMapper;
import com.github.fabriciolfj.domain.services.ContaService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller("/contas")
public class ContaController {

    private final ContaService contaService;
    private final ContaMapper mapper;

    @Post(consumes = MediaType.APPLICATION_JSON)
    public HttpResponse create(@Valid @Body final ContaRequest request) {
        final var conta = contaService.save(mapper.toEntity(request), request.getBanco());
        return HttpResponse.created(mapper.toResponse(conta));
    }
}
