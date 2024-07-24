package org.Zavatra.Ferry;

import java.util.List;

public class CarFerry extends Vehicule{
    private List<Vehicule> cargaison;

    public CarFerry(String model, String immatriculation, double kilometrage, double poidAVide, double reserveDeCarburant, Conducteur conducteur, List<Vehicule> cargaison) {
        super(model, immatriculation, kilometrage, poidAVide, reserveDeCarburant, conducteur);
        this.cargaison = cargaison;
    }
    @Override
    public double getPoids(){
        double poidsDeLaCargaison = 0;
        for (Vehicule vehicule : cargaison) {
            poidsDeLaCargaison+=vehicule.getPoids();
        }
        return poidAVide+ conducteur.getPoids()+reserveDeCarburant+poidsDeLaCargaison;
    }
    public void embarquer(Vehicule vehicule){
        cargaison.add(vehicule);
    }
    public void debarquer(Vehicule vehicule){
        cargaison.remove(vehicule);
    }
    public boolean chercherVoyageur(Conducteur conducteur){
        for (Vehicule vehicule : cargaison) {
            if(vehicule.getConducteur().equals(conducteur)){
                return true;
            }

        }
        return false;
    }

}
