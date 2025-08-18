package com.farmit.kartoffelsoft_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // Lombok-Annotation: erzeugt automatisch Getter, Setter, toString, equals, hashCode und RequiredArgsConstructor
@Entity
public class TeilDerLieferung {

    private long id;

    @ManyToOne // Ein Artikel kann von mehreren TeilDerLieferung Teil sein
    @JoinColumn(name = "artikelID", nullable = false) // Fremdschlüssel Spalte
    private Artikel artikel;

    @ManyToOne // Eine Lieferung kann mehrere TeilDerLieferung enthalten
    @JoinColumn(name = "lieferungID", nullable = false) // Fremdschlüssel Spalte
    private Lieferung lieferung;

    private int menge;
    private double preis;
}
