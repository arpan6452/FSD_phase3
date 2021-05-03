package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Shoes;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, Integer> {

}
