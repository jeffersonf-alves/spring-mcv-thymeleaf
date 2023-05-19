package com.mballen.curso.boot.dao;

import com.mballen.curso.boot.domain.Cargo;
import org.springframework.stereotype.Repository;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{


    @Override
    public Cargo findAll(Long id) {
        return null;
    }
}
