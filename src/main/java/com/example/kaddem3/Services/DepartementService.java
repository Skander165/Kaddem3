package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Departement;
import com.example.kaddem3.Repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartementService implements IDepartementService {
    @Autowired
    private final DepartmentRepository _departmentRepository;
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
}

