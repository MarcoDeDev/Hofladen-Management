package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Lieferung;
import com.farmit.kartoffelsoft_backend.repository.LieferungRepository;

import java.util.List;
import java.util.Optional;

public class LieferungServiceImpl implements LieferungService{

    private final LieferungRepository lieferungRepository;

    public LieferungServiceImpl(LieferungRepository lieferungRepository) {
        this.lieferungRepository = lieferungRepository;
    }


    @Override
    public Lieferung save(Lieferung lieferung) {
        return null;
    }

    @Override
    public Optional<Lieferung> getLieferungById(long id) {
        return null;
    }

    @Override
    public List<Lieferung> getAllLieferung() {
        return List.of();
    }

    @Override
    public void deleteLieferungById(long id) {

    }
}
