package org.Zavatra.Ferry;

import java.time.LocalDate;

public class Vehicule {
    String model;
    String immatriculation;
    double kilometrage;
    double poidAVide;
    double reserveDeCarburant;
    Conducteur conducteur;

    public Vehicule(String model, String immatriculation, double kilometrage, double poidAVide, double reserveDeCarburant, org.Zavatra.Ferry.Conducteur conducteur) {
        this.model = model;
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.poidAVide = poidAVide;
        this.reserveDeCarburant = reserveDeCarburant;
        this.conducteur = conducteur;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getImmatriculation() {
        return immatriculation;
    }
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }
    public double getKilometrage() {
        return kilometrage;
    }
    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }
    public double getPoidAVide() {
        return poidAVide;
    }
    public void setPoidAVide(double poidAVide) {
        this.poidAVide = poidAVide;
    }
    public double getReserveDeCarburant() {
        return reserveDeCarburant;
    }
    public void setReserveDeCarburant(double reserveDeCarburant) {
        this.reserveDeCarburant = reserveDeCarburant;
    }
    public org.Zavatra.Ferry.Conducteur getConducteur() {
        return conducteur;
    }
    public void setConducteur(org.Zavatra.Ferry.Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public void VerifyTheDriver(){
        if ((LocalDate.now().getYear()-conducteur.getDateNaissance().getYear())<18) {
            System.out.println("Ce conducteur ne peut pas conduire ce véhicule");
            conducteur=null;
        }
    }
    public void ChangerDeConducteur(Conducteur newConducteur){
        conducteur=newConducteur;
    }
    public double getPoids(){
        return poidAVide+ conducteur.getPoids()+reserveDeCarburant;
    }
    public void allerALaPompe(double ajoutDeCarburant){
        reserveDeCarburant+=ajoutDeCarburant;
    }
    public void rouler(double distance,double consomation){
        double CarburantNecessaire = distance * consomation;
        if(conducteur==null|| CarburantNecessaire<reserveDeCarburant){
            System.out.println("Le véhicule ne peut pas rouler dans les conditions actuelle");
        }
        else {
            System.out.println("La voiture roule , VROUM VROUM");
        }
    }
}
