package com.farmit.kartoffelsoft_backend.controller;

import com.farmit.kartoffelsoft_backend.model.Artikel;
import com.farmit.kartoffelsoft_backend.service.ArtikelService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/artikel")
public class ArtikelController {
    
    private final ArtikelService artikelService;

    public ArtikelController(ArtikelService artikelService) {
        this.artikelService = artikelService;
    }

    // Standard Methode
    // localhost:8080/api/artikel
    @GetMapping
    public List<Artikel> getAllArtikel(){
        return artikelService.getAllArtikel();
    }

    @GetMapping ("/{id}")
    public Optional<Artikel> getAllArtikel(@PathVariable("id") long id){
        return artikelService.getArtikelById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public Artikel save(@RequestBody Artikel artikel) {
        return artikelService.save(artikel);
    }

    @DeleteMapping ("/{id}")
    public void deleteArtikelById(@PathVariable("id") long id) {
        artikelService.deleteArtikelById(id);
    }
}
