package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Mitarbeiter;
import com.farmit.kartoffelsoft_backend.repository.MitarbeiterRepository;

import java.util.List;

public class MitarbeiterServiceImpl implements MitarbeiterService {

    private final MitarbeiterRepository mitarbeiterRepository;

    public MitarbeiterServiceImpl(MitarbeiterRepository mitarbeiterRepository) {
        this.mitarbeiterRepository = mitarbeiterRepository;
    }

    @Override
    public Mitarbeiter save(Mitarbeiter mitarbeiter) {
        return null;
    }

    @Override
    public Mitarbeiter getMitarbeiterById(long id) {
        return null;
    }

    @Override
    public List<Mitarbeiter> getAllMitarbeiter() {
        return List.of();
    }

    @Override
    public void deleteMitarbeiterById(long id) {

    }
}