package com.app.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.app.backend.entities.Laboratory;

@RepositoryRestResource
public interface LaboratoryRepository extends JpaRepository<Laboratory, Long> {
}
