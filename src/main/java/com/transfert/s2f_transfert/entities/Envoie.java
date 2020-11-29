package com.transfert.s2f_transfert.entities;

import javax.persistence.*;

@Entity
@Table(name="envoie")
public class Envoie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private String date;

    @Column(name = "montant")
    private int montant;

    @ManyToOne
    @JoinColumn(name = "emeteur_id")
    private Emeteur emeteur = new Emeteur();

    @ManyToOne
    @JoinColumn(name = "recepteur_id")
    private Recepteur recepteur = new Recepteur();


    public Envoie() {
    }

    public Envoie(int id, String date, int montant, Emeteur emeteur, Recepteur recepteur) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.emeteur = emeteur;
        this.recepteur = recepteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
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
}
