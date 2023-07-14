package com.javalab.board.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalab.board.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

	Optional<Category> findByCategoryNo(int i);
    
}
