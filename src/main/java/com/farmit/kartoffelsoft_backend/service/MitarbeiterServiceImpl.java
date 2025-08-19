package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Mitarbeiter;
import com.farmit.kartoffelsoft_backend.repository.MitarbeiterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MitarbeiterServiceImpl implements MitarbeiterService {

    private final MitarbeiterRepository mitarbeiterRepository;

    public MitarbeiterServiceImpl(MitarbeiterRepository mitarbeiterRepository) {
        this.mitarbeiterRepository = mitarbeiterRepository;
    }

    @Override
    public Mitarbeiter save(Mitarbeiter mitarbeiter) {
        return mitarbeiterRepository.save(mitarbeiter);
    }

    @Override
    public Optional<Mitarbeiter> getMitarbeiterById(long id) {
        return mitarbeiterRepository.findById(id);
    }

    @Override
    public List<Mitarbeiter> getAllMitarbeiter() {
        return mitarbeiterRepository.findAll();
    }

    @Override
    public void deleteMitarbeiterById(long id) {
        mitarbeiterRepository.deleteById(id);
    }
}