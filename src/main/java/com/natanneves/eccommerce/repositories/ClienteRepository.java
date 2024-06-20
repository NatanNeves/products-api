package com.natanneves.eccommerce.repositories;

import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
