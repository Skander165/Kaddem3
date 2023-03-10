package com.example.kaddem3.Repository;

import com.example.kaddem3.Models.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contrat, Integer> {
    List<Contrat> findByArchive(Boolean Archive);
}
