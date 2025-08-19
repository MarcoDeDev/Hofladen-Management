package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Abteilung;

import java.util.List;

public interface AbteilungService {

    Abteilung save(Abteilung abteilung);

    Abteilung getAbteilungById(long id);

    List<Abteilung> getAllAbteilung();

    void deleteAbteilungById(long id);
}
