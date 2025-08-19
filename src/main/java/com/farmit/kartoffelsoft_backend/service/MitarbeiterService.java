package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Mitarbeiter;

import java.util.List;

public interface MitarbeiterService {

    Mitarbeiter save(Mitarbeiter mitarbeiter);

    Mitarbeiter getMitarbeiterById(long id);

    List<Mitarbeiter> getAllMitarbeiter();

    void deleteMitarbeiterById(long id);
}
