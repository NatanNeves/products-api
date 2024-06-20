package com.natanneves.eccommerce.Controllers;

import com.natanneves.eccommerce.domain.Categoria;
import com.natanneves.eccommerce.domain.Cliente;
import com.natanneves.eccommerce.services.CategoriaService;
import com.natanneves.eccommerce.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll (){
        List<Cliente> lista = service.listAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping(value= "/{id}")
    public ResponseEntity<Optional<Cliente>> findById(@PathVariable Integer id){
        Optional<Cliente> cliente = service.findById(id);
        return ResponseEntity.ok(cliente);
    }
}
