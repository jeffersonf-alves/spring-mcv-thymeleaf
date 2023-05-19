package com.mballen.curso.boot.dao;

import com.mballen.curso.boot.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {


    @Override
    public Funcionario findAll(Long id) {
        return null;
    }
}
