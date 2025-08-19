package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.TeilDerLieferung;

import java.util.List;
import java.util.Optional;

public class TeilDerLieferungServiceImpl implements TeilDerLieferungService {
    @Override
    public TeilDerLieferung save(TeilDerLieferung teilDerLieferung) {
        return null;
    }

    @Override
    public Optional<TeilDerLieferung> getTeilDerLieferungById(long id) {
        return Optional.empty();
    }

    @Override
    public List<TeilDerLieferung> getAllTeilDerLieferung() {
        return List.of();
    }

    @Override
    public void deleteTeilDerLieferungById(long id) {

    }
}
