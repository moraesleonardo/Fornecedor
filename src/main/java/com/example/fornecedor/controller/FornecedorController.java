package com.example.fornecedor.controller;


import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.fornecedor.service.FornecedorService;
import com.example.fornecedor.model.Fornecedor;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;


    @GetMapping
    public Flux<Fornecedor> findAll(){
        return fornecedorService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Fornecedor> findById(@PathVariable Long id){
        return fornecedorService.findById(id);
    }
    @PostMapping
    public Mono<Fornecedor> save(@RequestBody Fornecedor fornecedor){
        return fornecedorService.save(fornecedor);
    }
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id){
        return fornecedorService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Mono<Fornecedor> update(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        return fornecedorService.update(id, fornecedor);
    }


}
