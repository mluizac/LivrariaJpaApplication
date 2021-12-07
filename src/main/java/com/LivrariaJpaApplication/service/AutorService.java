package com.LivrariaJpaApplication.service;

import com.LivrariaJpaApplication.model.Autor;
import com.LivrariaJpaApplication.repository.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AutorService {

    @Autowired private AutorRepository autorRepository;

    //salva
    public Autor save(Autor autor) {
       return autorRepository.save(autor);
    }

    //busca todos
    public Iterable<Autor> getAll(){
        return autorRepository.findAll();
    }

    //busca pelo id
    public Optional findById(Long id){
        return autorRepository.findById(id);
    }

    //deleta pelo id
    public void deleteById(Long id){
        autorRepository.deleteById(id);
    }

}
