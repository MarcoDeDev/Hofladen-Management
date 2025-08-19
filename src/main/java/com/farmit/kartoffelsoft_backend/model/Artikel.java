package com.farmit.kartoffelsoft_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data // Lombok-Annotation: erzeugt automatisch Getter, Setter, toString, equals, hashCode und RequiredArgsConstructor
@Entity
public class Artikel {

    @Id // (jakarta.persistence) als PRIMARY KEY zugewiesen
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT
    private long id;

    private String name;

    @ManyToOne // Viele Artikel können von einem Lieferanten geliefert werden
    @JoinColumn(name = "lieferantID") // Fremdschlüssel Spalte
    private Lieferant lieferant;

    @OneToMany(mappedBy = "artikel", cascade = CascadeType.ALL, orphanRemoval = true) // Eine Bestellung enthält viele TeilDerBestellung
    @JsonIgnore // Vermeidet Endlosschleifen
    private Set<TeilDerBestellung> teilDerBestellungen = new HashSet<>();

    @OneToMany(mappedBy = "artikel", cascade = CascadeType.ALL, orphanRemoval = true) // Eine Bestellung enthält viele TeilDerBestellung
    @JsonIgnore // Vermeidet Endlosschleifen
    private Set<TeilDerLieferung> teilDerLieferungen = new HashSet<>();

    private int menge;

    private WarenEinheit warenEinheit;

    private WarenTyp warenTyp;

    private double preisProEinheit;

    private int verdorbene;
    private int rabat;


}
