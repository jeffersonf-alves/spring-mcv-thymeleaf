package com.mballen.curso.boot.dao;

import com.mballen.curso.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    Departamento findAll(Long id);

    List<Departamento> findAll();
}
