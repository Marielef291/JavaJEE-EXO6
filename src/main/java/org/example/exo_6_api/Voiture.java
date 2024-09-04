package org.example.exo_6_api;

public class Voiture {

    private int id;
    private String marque;
    private String anneeFabrication;
    private String couleur;
    public int nbrVoiture = 1;

    public Voiture() {}

    public Voiture( String marque, String anneeFabrication, String couleur) {
        this.id = nbrVoiture;
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
        this.couleur = couleur;
        nbrVoiture++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(String anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
