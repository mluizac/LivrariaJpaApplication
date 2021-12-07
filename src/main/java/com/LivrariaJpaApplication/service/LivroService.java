package com.LivrariaJpaApplication.service;

import com.LivrariaJpaApplication.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LivroService {

    @Autowired private LivroRepository livroRepository;
}
