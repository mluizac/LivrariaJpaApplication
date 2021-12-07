package com.LivrariaJpaApplication.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

// editora-livro = 1-N bidirecional <->  @OneToMany

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Editora {

    @OneToMany(mappedBy="editora") //1-n com livros
    private Collection<Livro> livros;

    @Id
    @GeneratedValue
    private Long codigoEditora;
    private String nome;

}
