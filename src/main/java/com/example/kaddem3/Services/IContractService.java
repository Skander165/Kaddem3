package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Contrat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IContractService {
    void addContract(Contrat c);
    void updateContract(Contrat c);
    List<Contrat> getAllContracts();
    Contrat getContractById(Integer id);
    void deleteContract(Integer id);
    Contrat affectContratToEtudiant (Contrat ce, String nom, String prenom);
    Integer nbContratsValides(LocalDate startDate, LocalDate endDate);
}
