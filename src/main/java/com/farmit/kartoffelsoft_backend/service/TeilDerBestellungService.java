package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.TeilDerBestellung;

import java.util.List;
import java.util.Optional;

public interface TeilDerBestellungService {

    TeilDerBestellung save(TeilDerBestellung teilDerBestellung);

    Optional<TeilDerBestellung> getTeilDerBestellungById(long id);

    List<TeilDerBestellung> getAllTeilDerBestellung();

    void deleteTeilDerBestellungById(long id);
}
