package com.natanneves.eccommerce.services;

import com.natanneves.eccommerce.Controllers.exceptions.NotFoundException;
import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.domain.Cliente;
import com.natanneves.eccommerce.repositories.CategoriaRepository;
import com.natanneves.eccommerce.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listAll (){
        List<Cliente> clientes = repository.findAll();
        return clientes;
    }

    public Optional<Cliente> findById(Integer id){
        Optional<Cliente> cliente = repository.findById(id);

        if(cliente ==null){
            throw new NotFoundException("Cliente não encontrado");
        }
        return cliente;
    }
}
