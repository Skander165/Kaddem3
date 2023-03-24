package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Departement;
import com.example.kaddem3.Models.Etudiant;
import com.example.kaddem3.Models.Universite;
import com.example.kaddem3.Repository.DepartmentRepository;
import com.example.kaddem3.Repository.UniversiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartementService implements IDepartementService {


    private final DepartmentRepository _departmentRepository;
    private final UniversiteRepository _universiteRepository;
    @Override
    public void addDepartment(Departement d) {
        _departmentRepository.save(d);
    }

    @Override
    public void updateDepartment(Departement d) {
        _departmentRepository.save(d);
    }

    @Override
    public List<Departement> getAllDepartments() {
        return _departmentRepository.findAll();
    }

    @Override
    public Departement getDepartmentById(Integer id) {
        return _departmentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDepartment(Integer id) {
        _departmentRepository.deleteById(id);
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = _universiteRepository.findById(idUniversite).orElse(null);
        Assert.isNull(universite, "Universite n'existe pas");
        return universite.getDepartements();
    }
}

