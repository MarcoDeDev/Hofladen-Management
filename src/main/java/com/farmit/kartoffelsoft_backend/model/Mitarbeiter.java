package com.farmit.kartoffelsoft_backend.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data // Lombok-Annotation: erzeugt automatisch Getter, Setter, toString, equals, hashCode und RequiredArgsConstructor
@Entity
public class Mitarbeiter {

    @Id // (jakarta.persistence) als PRIMARY KEY zugewiesen
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT
    private long id;

    private String vorname;
    private String nachname;

    @ManyToOne // Viele Mitarbeiter können einer Abteilung gehören
    @JoinColumn(name = "abteilungID", nullable = false) // Fremdschlüssel Spalte
    private Abteilung abteilung;

}
