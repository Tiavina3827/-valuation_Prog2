package org.Zavatra.Ferry;

import java.util.List;

public class Voiture extends Vehicule{
    private int NombreLimiteDePassager;
    private List<Personne> NombreDePassager;

    public Voiture(String model, String immatriculation, double kilometrage, double poidAVide, double reserveDeCarburant, Conducteur conducteur, int nombreLimiteDePassager, List<Personne> nombreDePassager) {
        super(model, immatriculation, kilometrage, poidAVide, reserveDeCarburant, conducteur);
        NombreLimiteDePassager = nombreLimiteDePassager;
        NombreDePassager = nombreDePassager;
    }
    public int getNombreLimiteDePassager() {
        return NombreLimiteDePassager;
    }
    public void setNombreLimiteDePassager(int nombreLimiteDePassager) {
        NombreLimiteDePassager = nombreLimiteDePassager;
    }
    public List<Personne> getNombreDePassager() {
        return NombreDePassager;
    }
    public void setNombreDePassager(List<Personne> nombreDePassager) {
        NombreDePassager = nombreDePassager;
    }

   public boolean verifierLeNombreDePassager(){
        if(NombreDePassager.size() > NombreLimiteDePassager ){
            System.out.println("La voiture est surcharger , vous deveze retirer des passagers");
            return false;
        }
        else{
            System.out.println("Tout est en règle");
            return true;
        }
   }
   @Override
    public void rouler(double distance,double consomation){
        double CarburantNecessaire = distance * consomation;
        if(conducteur==null|| CarburantNecessaire<reserveDeCarburant||verifierLeNombreDePassager()==false){
            System.out.println("Le véhicule ne peut pas rouler dans les conditions actuelle");
        }
        else {
            System.out.println("La voiture roule , VROUM VROUM");
        }
    }
    public void monter(Personne personne){
        NombreDePassager.add(personne);
    }
    public void descendre(Personne personne){
        NombreDePassager.remove(personne);
    }
    @Override
    public double getPoids(){
        double poidsDesPasssagers = 0;
        for(Personne personne : NombreDePassager){
            poidsDesPasssagers += personne.getPoids();
        }
        return poidAVide+ conducteur.getPoids()+reserveDeCarburant+poidsDesPasssagers;
    }
}
