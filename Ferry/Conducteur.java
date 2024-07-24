package org.Zavatra.Ferry;

import java.time.LocalDate;
import java.util.Date;

public class Conducteur extends org.Zavatra.Ferry.Voyageur {
    private String numeroDePermis;

    public Conducteur(String nom, String prenom, LocalDate dateNaissance, String adresse, double poids, Date dateDeVoyage, String numeroDePermis) {
        super(nom, prenom, dateNaissance, adresse, poids, dateDeVoyage);
        this.numeroDePermis = numeroDePermis;
    }
}
