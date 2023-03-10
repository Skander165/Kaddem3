package com.example.kaddem3.Controllers;

import com.example.kaddem3.Models.Equipe;
import com.example.kaddem3.Services.IEquipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipe")
@RequiredArgsConstructor
public class EquipeController {
    private final IEquipeService _iEquipeServices;
    @GetMapping()
    public List<Equipe> getAllEquipe(){
        return _iEquipeServices.getAllEquipe();
    }
    @GetMapping("{id}")
    public Equipe getEquipeById(@PathVariable int id){
        return _iEquipeServices.getEquipeById(id);
    }
    @DeleteMapping("{id}")
    private void deleteEquipe(@PathVariable int id){
        _iEquipeServices.deleteEquipe(id);
    }
    @PostMapping()
    public void addEquipe(@RequestBody Equipe equipe){
        _iEquipeServices.addEquipe(equipe);
    }
    @PutMapping()
    private Equipe updateEquipe(@RequestBody Equipe equipe){
        _iEquipeServices.updateEquipe(equipe);
        return equipe;
    }
}