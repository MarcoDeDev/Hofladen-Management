package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Lieferung;
import com.farmit.kartoffelsoft_backend.repository.LieferungRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LieferungServiceImpl implements LieferungService{

    private final LieferungRepository lieferungRepository;

    public LieferungServiceImpl(LieferungRepository lieferungRepository) {
        this.lieferungRepository = lieferungRepository;
    }


    @Override
    public Lieferung save(Lieferung lieferung) {
        return lieferungRepository.save(lieferung);
    }

    @Override
    public Optional<Lieferung> getLieferungById(long id) {
        return lieferungRepository.findById(id);
    }

    @Override
    public List<Lieferung> getAllLieferung() {
        return lieferungRepository.findAll();
    }

    @Override
    public void deleteLieferungById(long id) {
        lieferungRepository.deleteById(id);
    }
}
