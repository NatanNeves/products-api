package com.natanneves.eccommerce.services;

import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listAll (){
        List<Categoria> categorias = repository.findAll();
        return categorias;
    }

}
