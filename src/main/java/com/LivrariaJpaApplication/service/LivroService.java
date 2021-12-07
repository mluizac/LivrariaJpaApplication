package com.LivrariaJpaApplication.service;

import com.LivrariaJpaApplication.dto.LivroDto;
import com.LivrariaJpaApplication.model.Autor;
import com.LivrariaJpaApplication.model.Livro;
import com.LivrariaJpaApplication.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LivroService {

    @Autowired private LivroRepository livroRepository;

    //salva
    public LivroDto save(LivroDto livro) {
        return livroRepository.save(livro);
    }

    //busca todos
    public Iterable<Livro> getAll(){
        return livroRepository.findAll();
    }

    //busca pelo id
    public Optional findById(Long id){
        return livroRepository.findById(id);
    }

    //deleta pelo id
    public void deleteById(Long id){
        livroRepository.deleteById(id);
    }

}
