package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Departement;

import java.util.List;

public interface IDepartementService {
    void addDepartment(Departement d);
    void updateDepartment(Departement d);
    List<Departement> getAllDepartments();
    Departement getDepartmentById(Integer id);
    void deleteDepartment(Integer id);
}
