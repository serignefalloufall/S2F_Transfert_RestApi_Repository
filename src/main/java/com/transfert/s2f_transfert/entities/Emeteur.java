package com.transfert.s2f_transfert.entities;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="emeteur")
public class Emeteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "tel")
    private String tel;

    @Column(name = "cni")
    private String cni;

    @OneToMany(mappedBy = "emeteur", fetch = FetchType.LAZY)
    private List<Envoie> envoies = new ArrayList<>();

    public Emeteur() {
    }

    public Emeteur(int id, String nom, String prenom, String tel, String cni, List<Envoie> envoies) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.cni = cni;
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

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public List<Envoie> getEnvoies() {
        return envoies;
    }

    public void setEnvoies(List<Envoie> envoies) {
        this.envoies = envoies;
    }
}
