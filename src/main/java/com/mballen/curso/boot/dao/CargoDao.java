package com.mballen.curso.boot.dao;

import com.mballen.curso.boot.domain.Cargo;
import com.mballen.curso.boot.domain.Departamento;

import java.util.List;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findAll(Long id);

    List<Cargo> findAll();

}
