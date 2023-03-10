package com.example.kaddem3.Repository;

import com.example.kaddem3.Models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    Etudiant findByNomAndPrenom(String nom,String prenom);
}
