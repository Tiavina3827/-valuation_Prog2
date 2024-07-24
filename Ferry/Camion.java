package org.Zavatra.Ferry;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehicule {
    private List<Colis> cargaison;

    public Camion(String model, String immatriculation, double kilometrage, double poidAVide, double reserveDeCarburant, Conducteur conducteur, List<Colis> cargaison) {
        super(model, immatriculation, kilometrage, poidAVide, reserveDeCarburant, conducteur);
        this.cargaison = cargaison;
    }

    public List<Colis> getCargaison() {
        return cargaison;
    }

    public void setCargaison(List<Colis> cargaison) {
        this.cargaison = cargaison;
    }
    public void ajouterColis(Colis colis) {
        cargaison.add(colis);
    }
    public void supprimerColis(Colis colis) {
        cargaison.remove(colis);
    }
    @Override
    public double getPoids(){
        double poids = 0;
        for (Colis colis : cargaison) {
            poids += colis.getPoids();
        }
        return poidAVide+ conducteur.getPoids()+reserveDeCarburant+poids;
    }
}
