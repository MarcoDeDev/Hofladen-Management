package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.GrossKunde;

import java.util.List;
import java.util.Optional;

public interface GrossKundeService {

    GrossKunde save(GrossKunde grossKunde);

    Optional<GrossKunde> getGrossKundeById(long id);

    List<GrossKunde> getAllGrossKunde();

    void deleteGrossKundeById(long id);
}
