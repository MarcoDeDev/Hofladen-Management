package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Bestellung;

import java.util.List;
import java.util.Optional;

public interface BestellungService {

    Bestellung save(Bestellung bestellung);

    Optional<Bestellung> getBestellungById(long id);

    List<Bestellung> getAllBestellung();

    void deleteBestellungById(long id);
}
