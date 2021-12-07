package com.LivrariaJpaApplication.controller;

import com.LivrariaJpaApplication.dto.LivroDto;
import com.LivrariaJpaApplication.model.Editora;
import com.LivrariaJpaApplication.model.Livro;
import com.LivrariaJpaApplication.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired private LivroService livroService;

    //salva
    @PostMapping
    public LivroDto save(@RequestBody LivroDto livro){
        return livroService.save(livro);
    }

    //busca todos
    @GetMapping
    public Iterable<Livro> getAll(){
        return livroService.getAll();
    }

    //busca pelo id
    @GetMapping("/{id}")
    public Optional findById(Long id){
        return livroService.findById(id);
    }

    //deleta pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        livroService.deleteById(id);
    }
}
