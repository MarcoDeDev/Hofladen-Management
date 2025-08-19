package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Artikel;
import com.farmit.kartoffelsoft_backend.repository.ArtikelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtikelServiceImpl implements ArtikelService {

    private final ArtikelRepository artikelRepository;

    public ArtikelServiceImpl(ArtikelRepository artikelRepository) {
        this.artikelRepository = artikelRepository;
    }

    @Override
    public Artikel save(Artikel artikel) {
        return artikelRepository.save(artikel);
    }

    @Override
    public Optional<Artikel> getArtikelById(long id) {
        return artikelRepository.findById(id);
    }

    @Override
    public List<Artikel> getAllArtikel() {
        return artikelRepository.findAll();
    }

    @Override
    public void deleteArtikelById(long id) {
        artikelRepository.deleteById(id);
    }
}
