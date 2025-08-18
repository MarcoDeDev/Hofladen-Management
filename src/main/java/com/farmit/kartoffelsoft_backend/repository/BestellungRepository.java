package com.farmit.kartoffelsoft_backend.repository;

import com.farmit.kartoffelsoft_backend.model.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellungRepository extends JpaRepository<Bestellung, Long> {
}
