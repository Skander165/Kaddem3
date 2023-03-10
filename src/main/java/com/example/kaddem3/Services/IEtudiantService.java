package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Etudiant;

import java.util.List;


public interface IEtudiantService {
    void addEtudiant(Etudiant etudiant);
    void updateEtudiant(Etudiant etudiant);
    List<Etudiant> getAll();
    Etudiant getById(int id);
    void deleteEtudiant(int id);
    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat,Integer idEquipe);
    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);
    Etudiant findByNomAndPrenom(String nom, String prenom);


}
