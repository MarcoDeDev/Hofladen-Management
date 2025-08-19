package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Lieferant;

import java.util.List;
import java.util.Optional;

public interface LieferantService {

    Lieferant save(Lieferant lieferant);

    Optional<Lieferant> getLieferantById(long id);

    List<Lieferant> getAllLieferant();

    void deleteLieferantById(long id);
}
