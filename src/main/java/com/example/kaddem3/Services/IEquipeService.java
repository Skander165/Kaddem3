package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Equipe;

import java.util.List;

public interface IEquipeService {
    void addEquipe(Equipe e);
    void updateEquipe(Equipe e);
    List<Equipe> getAllEquipe();
    Equipe getEquipeById(Integer id);
    void deleteEquipe(Integer id);
}
