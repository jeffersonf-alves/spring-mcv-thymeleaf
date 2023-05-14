package com.mballen.curso.boot.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Objects;
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public void setId(ID id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity<?> that = (AbstractEntity<?>) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id =" + id;
    }
}
