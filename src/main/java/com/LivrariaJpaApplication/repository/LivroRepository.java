package com.LivrariaJpaApplication.repository;

import com.LivrariaJpaApplication.model.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro,Long> {
}
