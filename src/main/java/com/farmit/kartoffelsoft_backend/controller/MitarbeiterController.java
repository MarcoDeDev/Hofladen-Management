package com.farmit.kartoffelsoft_backend.controller;


import com.farmit.kartoffelsoft_backend.model.Mitarbeiter;
import com.farmit.kartoffelsoft_backend.service.MitarbeiterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mitarbeiter")
public class MitarbeiterController {
    
    public final MitarbeiterService mitarbeiterService;

    public MitarbeiterController(MitarbeiterService mitarbeiterService) {
        this.mitarbeiterService = mitarbeiterService;
    }

    // Standard Methode
    // localhost:8080/api/mitarbeiter
    @GetMapping
    public List<Mitarbeiter> getAllMitarbeiter(){
        return mitarbeiterService.getAllMitarbeiter();
    }

    @GetMapping ("/{id}")
    public Optional<Mitarbeiter> getAllMitarbeiter(@PathVariable("id") long id){
        return mitarbeiterService.getMitarbeiterById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public Mitarbeiter save(@RequestBody Mitarbeiter mitarbeiter) {
        return mitarbeiterService.save(mitarbeiter);
    }

    @DeleteMapping ("/{id}")
    public void deleteMitarbeiterById(@PathVariable("id") long id) {
        mitarbeiterService.deleteMitarbeiterById(id);
    }
    
}
