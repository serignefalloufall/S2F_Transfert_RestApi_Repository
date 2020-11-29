package com.transfert.s2f_transfert.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="recepteur")
public class Recepteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "tel")
    private String tel;

    @OneToMany(mappedBy = "recepteur", fetch = FetchType.LAZY)
    private List<Envoie> envoies = new ArrayList<>();

    public Recepteur() {
    }

    public Recepteur(int id, String nom, String prenom, String tel, List<Envoie> envoies) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.envoies = envoies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Envoie> getEnvoies() {
        return envoies;
    }

    public void setEnvoies(List<Envoie> envoies) {
        this.envoies = envoies;
    }
}