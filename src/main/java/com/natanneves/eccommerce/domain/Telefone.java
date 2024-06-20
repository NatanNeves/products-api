package com.natanneves.eccommerce.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone {

    private String numero;
}
