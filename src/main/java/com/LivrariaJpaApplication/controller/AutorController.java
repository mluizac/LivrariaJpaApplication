package com.LivrariaJpaApplication.controller;

import com.LivrariaJpaApplication.model.Autor;
import com.LivrariaJpaApplication.service.AutorService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired private AutorService autorService;

    //salva
    @PostMapping
    public Autor save(@RequestBody Autor autor){
        return autorService.save(autor);
    }

    //busca todos
    @GetMapping
    public Iterable<Autor> getAll(){
        return autorService.getAll();
    }

    //busca pelo id
    @GetMapping("/{id}")
    public Optional findById(Long id){
        return autorService.findById(id);
    }

    //deleta pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        autorService.deleteById(id);
    }
}
