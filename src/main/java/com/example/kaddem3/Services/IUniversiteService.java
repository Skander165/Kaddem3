package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Universite;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IUniversiteService {
    void addUniversite(Universite u);
    void updateUniversite(Universite u);
    List<Universite> getAllUniversite();
    Universite getUniversiteById(Integer id);
    void deleteUniversite(Integer id);
    void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
    //public Map<String,Float> getMontantContartEntreDeuxDate(int idUniv, Date startDate, Date endDate)
}
