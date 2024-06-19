package com.natanneves.eccommerce.services;

import com.natanneves.eccommerce.Controllers.exceptions.NotFoundException;
import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listAll (){
        List<Categoria> categorias = repository.findAll();
        return categorias;
    }

    public Optional<Categoria> findById(Integer id){
        Optional<Categoria> categoria = repository.findById(id);

        if(categoria ==null){
            throw new NotFoundException("Categoria não encontrada");
        }
        return categoria;
    }
}
