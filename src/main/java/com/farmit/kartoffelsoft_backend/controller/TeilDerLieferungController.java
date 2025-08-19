package com.farmit.kartoffelsoft_backend.controller;

import com.farmit.kartoffelsoft_backend.model.TeilDerLieferung;
import com.farmit.kartoffelsoft_backend.service.TeilDerLieferungService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/teilderlieferung")
public class TeilDerLieferungController {

    private final TeilDerLieferungService teilDerLieferungService;


    public TeilDerLieferungController(TeilDerLieferungService teilDerLieferungService) {
        this.teilDerLieferungService = teilDerLieferungService;
    }

    // Standard Methode
    // localhost:8080/api/TeilDerLieferung
    @GetMapping
    public List<TeilDerLieferung> getAllTeilDerLieferung(){
        return teilDerLieferungService.getAllTeilDerLieferung();
    }

    @GetMapping ("/{id}")
    public Optional<TeilDerLieferung> getAllTeilDerLieferung(@PathVariable("id") long id){
        return teilDerLieferungService.getTeilDerLieferungById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public TeilDerLieferung save(@RequestBody TeilDerLieferung teilDerLieferung) {
        return teilDerLieferungService.save(teilDerLieferung);
    }

    @DeleteMapping ("/{id}")
    public void deleteTeilDerLieferungById(@PathVariable("id") long id) {
        teilDerLieferungService.deleteTeilDerLieferungById(id);
    }
    
}
