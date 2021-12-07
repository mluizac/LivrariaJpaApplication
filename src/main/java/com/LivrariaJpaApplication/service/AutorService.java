package com.LivrariaJpaApplication.service;

import com.LivrariaJpaApplication.repository.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AutorService {

    @Autowired private AutorRepository autorRepository;
}
