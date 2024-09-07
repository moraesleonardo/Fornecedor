package com.example.fornecedor.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import com.example.fornecedor.model.Fornecedor;


public interface FornecedorRepository extends R2dbcRepository<Fornecedor, Long>{
}



