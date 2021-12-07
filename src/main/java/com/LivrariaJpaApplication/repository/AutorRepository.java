package com.LivrariaJpaApplication.repository;

import com.LivrariaJpaApplication.model.Autor;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepository extends CrudRepository<Autor,Long> {
}
