package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Departement;
import com.example.kaddem3.Repository.DepartmentRepository;
import com.example.kaddem3.Repository.UniversiteRepository;
import com.example.kaddem3.Models.Universite;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UniversiteService implements IUniversiteService {
    @Autowired
    private final UniversiteRepository _universiteRepository;
    @Autowired
    private final DepartmentRepository _departementRepository;

    @Override
    public void addUniversite(Universite u) {
        _universiteRepository.save(u);
    }

    @Override
    public void updateUniversite(Universite u) {
        _universiteRepository.save(u);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return _universiteRepository.findAll();
    }

    @Override
    public Universite getUniversiteById(Integer id) {
        return _universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(Integer id) {
        _universiteRepository.deleteById(id);
    }
    @Override
    @Transactional
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = _universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = _departementRepository.findById(idDepartement).orElse(null);
        Assert.notNull(universite, "Universite must not be null.");
        Assert.notNull(departement, "Departement must not be null.");
        universite.getDepartements().add(departement);
    }
}