package com.farmit.kartoffelsoft_backend.repository;

import com.farmit.kartoffelsoft_backend.model.Mitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Long> {
}
