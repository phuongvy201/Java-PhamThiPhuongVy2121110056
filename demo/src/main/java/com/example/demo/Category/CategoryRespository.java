package com.example.demo.Category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryRespository extends JpaRepository<Category, Integer> {
    List<Category> findByNameContainingOrDescriptionContaining(String text, String textAgain);
}
