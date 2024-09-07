package com.example.fornecedor.service;

import com.example.fornecedor.model.Fornecedor;

import com.example.fornecedor.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Flux<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }

    public Mono<Fornecedor> findById(Long id){
        return fornecedorRepository.findById(id);
    }

    public Mono<Fornecedor> save(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public Mono<Void> deleteById(Long id){
        return fornecedorRepository.deleteById(id);
    }

}


