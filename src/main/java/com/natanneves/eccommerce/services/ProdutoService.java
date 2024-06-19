package com.natanneves.eccommerce.services;

import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.domain.Produto;
import com.natanneves.eccommerce.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public List<Produto> listAll (){
        List<Produto> produtos = repository.findAll();
        return produtos;
    }

    public Optional<Produto> findById(Integer id){
        return repository.findById(id);
    }
}
