package com.LivrariaJpaApplication.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

// autor-livro = N-N unidirecional -> @ManyToMany

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoAutor;
    private String primeiroNome;
    private String ultimoNome;

}
