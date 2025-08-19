package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.TeilDerLieferung;

import java.util.List;
import java.util.Optional;

public interface TeilDerLieferungService {

    TeilDerLieferung save(TeilDerLieferung teilDerLieferung);

    Optional<TeilDerLieferung> getTeilDerLieferungById(long id);

    List<TeilDerLieferung> getAllTeilDerLieferung();

    void deleteTeilDerLieferungById(long id);
}
