package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.TeilDerBestellung;
import com.farmit.kartoffelsoft_backend.repository.TeilDerBestellungRepository;

import java.util.List;
import java.util.Optional;

public class TeilDerBestellungServiceImpl implements TeilDerBestellungService {

    private final TeilDerBestellungRepository teilDerBestellungRepository;

    public TeilDerBestellungServiceImpl(TeilDerBestellungRepository teilDerBestellungRepository) {
        this.teilDerBestellungRepository = teilDerBestellungRepository;
    }

    @Override
    public TeilDerBestellung save(TeilDerBestellung teilDerBestellung) {
        return null;
    }

    @Override
    public Optional<TeilDerBestellung> getTeilDerBestellungById(long id) {
        return null;
    }

    @Override
    public List<TeilDerBestellung> getAllTeilDerBestellung() {
        return List.of();
    }

    @Override
    public void deleteTeilDerBestellungById(long id) {

    }
}
