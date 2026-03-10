package com.models;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class usuario {

    private long id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String endereco;

    
}
