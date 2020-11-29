package com.transfert.s2f_transfert.entities;

public class Info {

    private Emeteur emeteur = new Emeteur();
    private Recepteur recepteur = new Recepteur();
    private Envoie envoie = new Envoie();

    public Info() {
    }

    public Info(Emeteur emeteur, Recepteur recepteur, Envoie envoie) {
        this.emeteur = emeteur;
        this.recepteur = recepteur;
        this.envoie = envoie;
    }

    public Emeteur getEmeteur() {
        return emeteur;
    }

    public void setEmeteur(Emeteur emeteur) {
        this.emeteur = emeteur;
    }

    public Recepteur getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Recepteur recepteur) {
        this.recepteur = recepteur;
    }

    public Envoie getEnvoie() {
        return envoie;
    }

    public void setEnvoie(Envoie envoie) {
        this.envoie = envoie;
    }
}
