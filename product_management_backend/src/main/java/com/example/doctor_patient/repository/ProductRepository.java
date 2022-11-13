package com.example.doctor_patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doctor_patient.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}