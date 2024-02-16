package com.apnareview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apnareview.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
