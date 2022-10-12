package com.example.test.repository;

import com.example.test.model.National;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INationalRepository extends JpaRepository<National, Long> {
}