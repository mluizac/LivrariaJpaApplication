package com.LivrariaJpaApplication.service;

import com.LivrariaJpaApplication.dto.EditoraDto;
import com.LivrariaJpaApplication.model.Editora;
import com.LivrariaJpaApplication.repository.EditoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EditoraService {

    @Autowired private EditoraRepository editoraRepository;

    //salva
    public EditoraDto save(EditoraDto editora) {
        return editoraRepository.save(editora);
    }

    //busca todos
    public Iterable<Editora> getAll(){
        return editoraRepository.findAll();
    }

    //busca pelo id
    public Optional findById(Long id){
        return editoraRepository.findById(id);
    }

    //deleta pelo id
    public void deleteById(Long id){
        editoraRepository.deleteById(id);
    }
}
