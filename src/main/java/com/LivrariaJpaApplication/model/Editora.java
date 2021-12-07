package com.LivrariaJpaApplication.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

// editora-livro = 1-N bidirecional <->  @OneToMany

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Editora {

    @OneToMany(mappedBy="editora") //1-n com livros
    private Collection<Livro> livros;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoEditora;
    private String nome;

}
