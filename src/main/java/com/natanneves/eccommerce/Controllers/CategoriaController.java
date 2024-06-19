package com.natanneves.eccommerce.Controllers;

import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll (){
        List<Categoria> lista = service.listAll();
        return ResponseEntity.ok(lista);
    }



    @GetMapping(value= "/{id}")
    public ResponseEntity<Optional<Categoria>> findById(@PathVariable Integer id){
        Optional<Categoria> categoria = service.findById(id);
        return ResponseEntity.ok(categoria);
    }
}
