package com.example.kaddem3.Controllers;


import com.example.kaddem3.Models.DetailsEquipe;
import com.example.kaddem3.Services.IDetailsEquipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("detailequipe")
@RequiredArgsConstructor
public class DetailsEquipeController {
    @Autowired
    private final IDetailsEquipeService _iDetailsEquipeServices;

    @GetMapping()
    public List<DetailsEquipe> getAllDetailEquipe(){
        return _iDetailsEquipeServices.getAllDetailsEquipe();
    }
    @GetMapping("{id}")
    public DetailsEquipe getDetailEquipeById(@PathVariable int id){
        return _iDetailsEquipeServices.getDetailEquipeById(id);
    }
    @DeleteMapping("{id}")
    private void deleteDetailsEquipe(@PathVariable int id){
        _iDetailsEquipeServices.deleteDetailsEquipe(id);
    }
    @PostMapping()
    public void addDetailsEquipe(@RequestBody DetailsEquipe detailEquipe){
        _iDetailsEquipeServices.addDetailsEquipe(detailEquipe);
    }
    @PutMapping()
    private DetailsEquipe updateDetailsEquipe(@RequestBody DetailsEquipe detailEquipe){
        _iDetailsEquipeServices.updateDetailsEquipe(detailEquipe);
        return detailEquipe;
    }
}
