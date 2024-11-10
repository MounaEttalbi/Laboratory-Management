package com.app.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.backend.entities.Laboratory;

public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {
}
