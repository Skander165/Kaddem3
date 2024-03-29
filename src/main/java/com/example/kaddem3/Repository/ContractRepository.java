package com.example.kaddem3.Repository;

import com.example.kaddem3.Models.Contrat;
import com.example.kaddem3.Models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contrat, Integer> {
    int countByArchiveIsFalseAndEtudiantNomAndEtudiantPrenom(String nom, String prenom);

    List<Contrat> findByArchiveIsFalse();

}
