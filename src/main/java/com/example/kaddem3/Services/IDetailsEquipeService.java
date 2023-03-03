package com.example.kaddem3.Services;

import com.example.kaddem3.Models.DetailsEquipe;

import java.util.List;

public interface IDetailsEquipeService {
    void addDetailsEquipe(DetailsEquipe d);
    void updateDetailsEquipe(DetailsEquipe d);
    List<DetailsEquipe> getAllDetailsEquipe();
    DetailsEquipe getDetailEquipeById(Integer id);
    void deleteDetailsEquipe(Integer id);
}
