package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Lieferant;
import com.farmit.kartoffelsoft_backend.repository.LieferantRepository;

import java.util.List;
import java.util.Optional;

public class LieferantServiceImpl implements LieferantService{

    public final LieferantRepository lieferantRepository;

    public LieferantServiceImpl(LieferantRepository lieferantRepository) {
        this.lieferantRepository = lieferantRepository;
    }

    @Override
    public Lieferant save(Lieferant lieferant) {
        return lieferantRepository.save(lieferant);
    }

    @Override
    public Optional<Lieferant> getLieferantById(long id) {
        return lieferantRepository.findById(id);
    }

    @Override
    public List<Lieferant> getAllLieferant() {
        return lieferantRepository.findAll();
    }

    @Override
    public void deleteLieferantById(long id) {
        lieferantRepository.deleteById(id);
    }
}
