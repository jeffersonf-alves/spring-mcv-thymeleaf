package com.mballen.curso.boot.domain;


import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name ="CARGOS")
public abstract class Cargo extends AbstractEntity<Long>{

    @Column(name="nome", nullable = false, unique = true, length = 60)
    private String nome;

    @ManyToMany
    @JoinColumn(name = "id_departamento_fk")
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
