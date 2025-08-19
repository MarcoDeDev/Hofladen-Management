package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.GrossKunde;
import com.farmit.kartoffelsoft_backend.repository.GrossKundeRepository;

import java.util.List;
import java.util.Optional;

public class GrossKundeServiceImpl implements GrossKundeService{

    private final GrossKundeRepository grossKundeRepository;

    public GrossKundeServiceImpl(GrossKundeRepository grossKundeRepository) {
        this.grossKundeRepository = grossKundeRepository;
    }

    @Override
    public GrossKunde save(GrossKunde grossKunde) {
        return grossKundeRepository.save(grossKunde);
    }

    @Override
    public Optional<GrossKunde> getGrossKundeById(long id) {
        return grossKundeRepository.findById(id);
    }

    @Override
    public List<GrossKunde> getAllGrossKunde() {
        return grossKundeRepository.findAll();
    }

    @Override
    public void deleteGrossKundeById(long id) {
        grossKundeRepository.deleteById(id);
    }
}
