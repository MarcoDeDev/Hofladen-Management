package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Bestellung;
import com.farmit.kartoffelsoft_backend.repository.BestellungRepository;

import java.util.List;
import java.util.Optional;

public class BestellungServiceImpl implements BestellungService{

    private final BestellungRepository bestellungRepository;

    public BestellungServiceImpl(BestellungRepository bestellungRepository) {
        this.bestellungRepository = bestellungRepository;
    }

    @Override
    public Bestellung save(Bestellung bestellung) {
        return bestellungRepository.save(bestellung);
    }

    @Override
    public Optional<Bestellung> getBestellungById(long id) {
        return bestellungRepository.findById(id);
    }

    @Override
    public List<Bestellung> getAllBestellung() {
        return bestellungRepository.findAll();
    }

    @Override
    public void deleteBestellungById(long id) {
        bestellungRepository.deleteById(id);
    }
}
