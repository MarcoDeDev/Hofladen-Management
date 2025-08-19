package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Artikel;

import java.util.List;
import java.util.Optional;

public interface ArtikelService {

    Artikel save(Artikel artikel);

    Optional<Artikel> getArtikelById(long id);

    List<Artikel> getAllArtikel();

    void deleteArtikelById(long id);
}
