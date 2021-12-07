package com.LivrariaJpaApplication.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Collection;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Livro {

    @ManyToOne() //n-1 com editora-bidirecional
    private Editora editora;
    @JoinColumn (name="codigoEditora") //FK de editora

    @ManyToMany //N-N unidirecional
    @JoinTable(name="livros_tem_autores", joinColumns=
            {@JoinColumn(name="codigoLivro")},
    inverseJoinColumns= {@JoinColumn(name="codigoAutor", unique=true)})
    private Collection<Autor> autores;

    @Id
    @GeneratedValue
    private Long codigoLivro;
    private String titulo;
    private int ano;

}
