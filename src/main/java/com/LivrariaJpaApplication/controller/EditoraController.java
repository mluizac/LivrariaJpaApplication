package com.LivrariaJpaApplication.controller;

import com.LivrariaJpaApplication.dto.EditoraDto;
import com.LivrariaJpaApplication.model.Autor;
import com.LivrariaJpaApplication.model.Editora;
import com.LivrariaJpaApplication.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired private EditoraService editoraService;

    //salva
    @PostMapping
    public EditoraDto save(@RequestBody EditoraDto editora){
        return editoraService.save(editora);
    }

    //busca todos
    @GetMapping
    public Iterable<Editora> getAll(){
        return editoraService.getAll();
    }

    //busca pelo id
    @GetMapping("/{id}")
    public Optional findById(Long id){
        return editoraService.findById(id);
    }

    //deleta pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        editoraService.deleteById(id);
    }
}
