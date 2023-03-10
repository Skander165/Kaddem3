package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Equipe;
import com.example.kaddem3.Repository.EquipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EquipeService implements IEquipeService{
    private final EquipeRepository _equipeRepository;
    @Override
    public void addEquipe(Equipe e) {
        _equipeRepository.save(e);
    }

    @Override
    public void updateEquipe(Equipe e) {
        _equipeRepository.save(e);
    }

    @Override
    public List<Equipe> getAllEquipe() {
        return _equipeRepository.findAll();
    }

    @Override
    public Equipe getEquipeById(Integer id) {
        return _equipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEquipe(Integer id) {
        _equipeRepository.deleteById(id);
    }
}
