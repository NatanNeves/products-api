package com.natanneves.eccommerce.domain;

import java.io.Serializable;
import java.util.Objects;

public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;

    private String numero;

    public Telefone(){
    }

    public Telefone(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
