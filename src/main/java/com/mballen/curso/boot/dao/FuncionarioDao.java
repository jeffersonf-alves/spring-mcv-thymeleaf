package com.mballen.curso.boot.dao;


import com.mballen.curso.boot.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {

    void save(Funcionario funcionario);

    void update(Funcionario funcionario);

    void delete(Long id);

    Funcionario findAll(Long id);

    List<Funcionario> findAll();

}
