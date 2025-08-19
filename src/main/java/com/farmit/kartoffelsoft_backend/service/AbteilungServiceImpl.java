package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Abteilung;
import com.farmit.kartoffelsoft_backend.repository.AbteilungRepository;

import java.util.List;

public class AbteilungServiceImpl implements AbteilungService{

    private final AbteilungRepository abteilungRepository;

    public AbteilungServiceImpl(AbteilungRepository abteilungRepository) {
        this.abteilungRepository = abteilungRepository;
    }

    @Override
    public Abteilung save(Abteilung abteilung) {
        return null;
    }

    @Override
    public Abteilung getAbteilungById(long id) {
        return null;
    }

    @Override
    public List<Abteilung> getAllAbteilung() {
        return List.of();
    }

    @Override
    public void deleteAbteilungById(long id) {

    }
}
