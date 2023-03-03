package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Universite;

import java.util.List;

public interface IUniversiteService {
    void addUniversite(Universite u);
    void updateUniversite(Universite u);
    List<Universite> getAllUniversite();
    Universite getUniversiteById(Integer id);
    void deleteUniversite(Integer id);
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
