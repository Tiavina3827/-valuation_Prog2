package org.Zavatra.Ferry;

public class Colis {
   private double  poids;
    private String  descritpion;

    public Colis(double poids, String descritpion) {
        this.poids = poids;
        this.descritpion = descritpion;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }
}
