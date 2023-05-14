package com.mballen.curso.boot.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long>{

    @Column(name="nome", nullable = false, unique = true, length = 60)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
