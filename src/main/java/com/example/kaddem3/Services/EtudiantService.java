package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Contrat;
import com.example.kaddem3.Models.Departement;
import com.example.kaddem3.Models.Equipe;
import com.example.kaddem3.Models.Etudiant;
import com.example.kaddem3.Repository.ContractRepository;
import com.example.kaddem3.Repository.DepartmentRepository;
import com.example.kaddem3.Repository.EquipeRepository;
import com.example.kaddem3.Repository.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class EtudiantService implements IEtudiantService {
    @Autowired
    private final EtudiantRepository _etudiantRepository;
    private final DepartmentRepository _departementRepository;
    private final ContractRepository _contratRepository;
    private final EquipeRepository _equipeRepository;

    @Override
    public void addEtudiant(Etudiant etudiant) {
        _etudiantRepository.save(etudiant);
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        _etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getAll() {
        return _etudiantRepository.findAll();
    }

    @Override
    public Etudiant getById(int id) {
        return _etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEtudiant(int id) {
        _etudiantRepository.deleteById(id);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant etudiant = _etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = _departementRepository.findById(departementId).orElse(null);
        Assert.notNull(etudiant, "Etudiant must not be null");
        Assert.notNull(departement, "Department must not be null");
        etudiant.setDepartement(departement);
        _etudiantRepository.save(etudiant);

    }

    @Override
    @Transactional
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer contractId, Integer equipeId) {
        Contrat contrat = _contratRepository.findById(contractId).orElse(null);
        Equipe equipe = _equipeRepository.findById(equipeId).orElse(null);
        Assert.notNull(contrat,"contract must no be null");
        Assert.notNull(equipe,"equipe must no be null");
        List<Equipe> equipes = new ArrayList<>();
        equipes.add(equipe);
        e.setEquipes(equipes);
        _etudiantRepository.saveAndFlush(e);
        contrat.setEtudiant(e);
        return e;
    }
}
