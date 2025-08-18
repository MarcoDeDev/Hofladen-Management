package com.farmit.kartoffelsoft_backend.repository;

import com.farmit.kartoffelsoft_backend.model.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtikelRepository extends JpaRepository<Artikel, Long> {
}
