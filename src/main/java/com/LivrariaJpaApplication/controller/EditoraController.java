package com.LivrariaJpaApplication.controller;

import com.LivrariaJpaApplication.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired private EditoraService editoraService;
}
