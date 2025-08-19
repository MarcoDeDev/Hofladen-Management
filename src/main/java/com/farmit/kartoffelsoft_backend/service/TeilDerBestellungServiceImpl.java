package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.TeilDerBestellung;
import com.farmit.kartoffelsoft_backend.repository.TeilDerBestellungRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeilDerBestellungServiceImpl implements TeilDerBestellungService {

    private final TeilDerBestellungRepository teilDerBestellungRepository;

    public TeilDerBestellungServiceImpl(TeilDerBestellungRepository teilDerBestellungRepository) {
        this.teilDerBestellungRepository = teilDerBestellungRepository;
    }

    @Override
    public TeilDerBestellung save(TeilDerBestellung teilDerBestellung) {
        return teilDerBestellungRepository.save(teilDerBestellung);
    }

    @Override
    public Optional<TeilDerBestellung> getTeilDerBestellungById(long id) {
        return teilDerBestellungRepository.findById(id);
    }

    @Override
    public List<TeilDerBestellung> getAllTeilDerBestellung() {
        return teilDerBestellungRepository.findAll();
    }

    @Override
    public void deleteTeilDerBestellungById(long id) {
        teilDerBestellungRepository.deleteById(id);
    }
}
