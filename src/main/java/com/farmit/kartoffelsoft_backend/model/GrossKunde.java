package com.farmit.kartoffelsoft_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // Lombok-Annotation: erzeugt automatisch Getter, Setter, toString, equals, hashCode und RequiredArgsConstructor
@Entity
public class GrossKunde {

    @Id // (jakarta.persistence) als PRIMARY KEY zugewiesen
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT
    private long id;

    private String vorname;
    private String nachname;
    private String firmaName;
    private String strasse;
    private String plz;
    private String ort;
    private String emailAdresse;
    private String telefon;

    public GrossKunde(String vorname, String nachname, String firmaName, String strasse, String plz, String ort, String emailAdresse, String telefon) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.firmaName = firmaName;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.emailAdresse = emailAdresse;
        this.telefon = telefon;
    }


}
