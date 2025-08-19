package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Abteilung;
import com.farmit.kartoffelsoft_backend.repository.AbteilungRepository;

import java.util.List;
import java.util.Optional;

public class AbteilungServiceImpl implements AbteilungService{

    private final AbteilungRepository abteilungRepository;

    public AbteilungServiceImpl(AbteilungRepository abteilungRepository) {
        this.abteilungRepository = abteilungRepository;
    }

    @Override
    public Abteilung save(Abteilung abteilung) {
        return abteilungRepository.save(abteilung);
    }

    @Override
    public Optional<Abteilung> getAbteilungById(long id) {
        return abteilungRepository.findById(id);
    }

    @Override
    public List<Abteilung> getAllAbteilung() {
        return abteilungRepository.findAll();
    }

    @Override
    public void deleteAbteilungById(long id) {
        abteilungRepository.deleteById(id);
    }
}
