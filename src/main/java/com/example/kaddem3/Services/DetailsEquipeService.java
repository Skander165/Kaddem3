package com.example.kaddem3.Services;

import com.example.kaddem3.Models.DetailsEquipe;
import com.example.kaddem3.Repository.DetailsEquipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class DetailsEquipeService implements IDetailsEquipeService{
    @Autowired
    private final DetailsEquipeRepository _detailsEquipeRepository;
    @Override
    public void addDetailsEquipe(DetailsEquipe d) {
        _detailsEquipeRepository.save(d);
    }

    @Override
    public void updateDetailsEquipe(DetailsEquipe d) {
        _detailsEquipeRepository.save(d);
    }

    @Override
    public List<DetailsEquipe> getAllDetailsEquipe() {
        return _detailsEquipeRepository.findAll();
    }

    @Override
    public DetailsEquipe getDetailEquipeById(Integer id) {
        return _detailsEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDetailsEquipe(Integer id) {
        _detailsEquipeRepository.deleteById(id);
    }
}
