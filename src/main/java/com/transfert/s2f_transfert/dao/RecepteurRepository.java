package com.transfert.s2f_transfert.dao;

import com.transfert.s2f_transfert.entities.Recepteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecepteurRepository extends JpaRepository<Recepteur,Integer> {
}
