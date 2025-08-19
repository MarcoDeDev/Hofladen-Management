package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Mitarbeiter;

import java.util.List;
import java.util.Optional;

public interface MitarbeiterService {

    Mitarbeiter save(Mitarbeiter mitarbeiter);

    Optional<Mitarbeiter> getMitarbeiterById(long id);

    List<Mitarbeiter> getAllMitarbeiter();

    void deleteMitarbeiterById(long id);
}
