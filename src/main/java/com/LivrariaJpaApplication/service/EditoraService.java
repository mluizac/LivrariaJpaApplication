package com.LivrariaJpaApplication.service;

import com.LivrariaJpaApplication.repository.EditoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EditoraService {

    @Autowired private EditoraRepository editoraRepository;
}
