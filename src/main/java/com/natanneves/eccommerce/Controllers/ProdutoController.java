package com.natanneves.eccommerce.Controllers;

import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.domain.Produto;
import com.natanneves.eccommerce.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll (){
        List<Produto> lista = service.listAll();
        return ResponseEntity.ok(lista);
    }


    @GetMapping(value= "/{id}")
    public ResponseEntity<Optional<Produto>> findById(@PathVariable Integer id){
        Optional<Produto> produto = service.findById(id);
        return ResponseEntity.ok(produto);
    }
}
