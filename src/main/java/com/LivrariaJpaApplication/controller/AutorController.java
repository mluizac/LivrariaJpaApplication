package com.LivrariaJpaApplication.controller;

import com.LivrariaJpaApplication.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired private AutorService autorService;
}
