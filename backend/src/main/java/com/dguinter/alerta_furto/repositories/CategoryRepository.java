package com.dguinter.alerta_furto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dguinter.alerta_furto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
