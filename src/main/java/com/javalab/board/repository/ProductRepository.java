package com.javalab.board.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.javalab.board.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

}