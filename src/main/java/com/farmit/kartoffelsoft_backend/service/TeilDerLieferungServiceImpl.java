package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.TeilDerLieferung;
import com.farmit.kartoffelsoft_backend.repository.TeilDerLieferungRepository;

import java.util.List;
import java.util.Optional;

public class TeilDerLieferungServiceImpl implements TeilDerLieferungService {

    private final TeilDerLieferungRepository teilDerLieferungRepository;

    public TeilDerLieferungServiceImpl(TeilDerLieferungRepository teilDerLieferungRepository) {
        this.teilDerLieferungRepository = teilDerLieferungRepository;
    }

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
