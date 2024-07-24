package org.Zavatra.Ferry;

import java.time.LocalDate;
import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;
    private double poids;

    public Personne(String nom, String prenom, LocalDate dateNaissance, String adresse, double poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne personne)) return false;
        return Double.compare(poids, personne.poids) == 0 && Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom) && Objects.equals(dateNaissance, personne.dateNaissance) && Objects.equals(adresse, personne.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, dateNaissance, adresse, poids);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse='" + adresse + '\'' +
                ", poids=" + poids +
                '}';
    }
    public void voyager(){}
}
