package com.transfert.s2f_transfert.controller;

import com.transfert.s2f_transfert.dao.EmeteurRepository;
import com.transfert.s2f_transfert.dao.EnvoieRepository;
import com.transfert.s2f_transfert.dao.RecepteurRepository;
import com.transfert.s2f_transfert.entities.Emeteur;
import com.transfert.s2f_transfert.entities.Envoie;
import com.transfert.s2f_transfert.entities.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    EmeteurRepository emeteurRepository;

    @Autowired
    RecepteurRepository recepteurRepository;

    @Autowired
    EnvoieRepository envoieRepository;

    @PostMapping("/add")
    public String addEnvoie(@RequestBody Info info){

    if(info != null){

        emeteurRepository.save(info.getEmeteur());

        recepteurRepository.save(info.getRecepteur());

        Envoie e = new Envoie();

        e.setEmeteur(info.getEmeteur());
        e.setRecepteur(info.getRecepteur());
        e.setMontant(info.getEnvoie().getMontant());
        e.setDate(info.getEnvoie().getDate());
        envoieRepository.save(e);
        return "Envoie enregistre avec succe";
    }else {
        return "ok";
    }


    }

    @GetMapping("/allEnvoie")
    public List<Envoie> listeEnvoie(){
        return envoieRepository.findAll();
    }


}
