package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Contrat;
import com.example.kaddem3.Models.Etudiant;
import com.example.kaddem3.Repository.ContractRepository;
import com.example.kaddem3.Repository.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContractService implements IContractService {
    private final ContractRepository _contractRepository;
    private final EtudiantRepository _etudiantRepository;

    @Override
    public void addContract(Contrat c) {
        _contractRepository.save(c);

    }

    @Override
    public void updateContract(Contrat c) {
        _contractRepository.save(c);
    }

    @Override
    public List<Contrat> getAllContracts() {
        return _contractRepository.findAll();
    }

    @Override
    public Contrat getContractById(Integer id) {
        return _contractRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContract(Integer id) {
        _contractRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {

        int nbContratValide = _contractRepository.countByArchiveIsFalseAndEtudiantNomAndEtudiantPrenom(nomE, prenomE);
        Assert.isTrue(nbContratValide > 5, "L'Etudiant ne peut avoir de contrat");
        Etudiant etudiant = _etudiantRepository.findByNomAndPrenom(nomE,prenomE);
        Assert.notNull(etudiant,"Etudiant 404 not found");
        _contractRepository.save(ce);
        etudiant.getContrats().add(ce);
        return ce;
    }

    @Override
    public Integer nbContratsValides(LocalDate startDate, LocalDate endDate){
        List<Contrat> total = _contractRepository.findByArchiveIsFalse();
        List<Contrat> valides = new ArrayList<>();
        for (Contrat c: total) {
            if (!c.getDebutContrat().isAfter(endDate) && !c.getFinContrat().isBefore(startDate)) {
                valides.add(c);
            }
        }
        return valides.size();


    }


}
