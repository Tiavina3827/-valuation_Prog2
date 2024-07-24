package org.Zavatra.Ferry;

import java.time.LocalDate;
import java.util.Date;

public class Voyageur extends org.Zavatra.Ferry.Personne {
    private Date dateDeVoyage;

    public Voyageur(String nom, String prenom, LocalDate dateNaissance, String adresse, double poids, Date dateDeVoyage) {
        super(nom, prenom, dateNaissance, adresse, poids);
        this.dateDeVoyage = dateDeVoyage;
    }
}
