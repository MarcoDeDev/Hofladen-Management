package com.farmit.kartoffelsoft_backend.service;

import com.farmit.kartoffelsoft_backend.model.Lieferung;

import java.util.List;
import java.util.Optional;

public interface LieferungService {

    Lieferung save(Lieferung lieferung);

    Optional<Lieferung> getLieferungById(long id);

    List<Lieferung> getAllLieferung();

    void deleteLieferungById(long id);

}
