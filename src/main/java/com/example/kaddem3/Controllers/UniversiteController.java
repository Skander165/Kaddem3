package com.example.kaddem3.Controllers;

import com.example.kaddem3.Models.Universite;
import com.example.kaddem3.Services.IUniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("universite")
@RequiredArgsConstructor
public class UniversiteController {
    private final IUniversiteService _iUniversiteService;

    @GetMapping("/getAllUniversite")
    public List<Universite> getAllUniversite(){
        return _iUniversiteService.getAllUniversite();
    }
    @GetMapping("/getByIdUniversite/{id}")
    public Universite getUniversiteById(@PathVariable int id){
        return _iUniversiteService.getUniversiteById(id);
    }
    @DeleteMapping("/DeleteUniversite/{id}")
    public void deleteUniversite(@PathVariable int id){
        _iUniversiteService.deleteUniversite(id);
    }
    @PostMapping("ajoutUniversite")
    public void addUniversite(@RequestBody Universite universite){
        _iUniversiteService.addUniversite(universite);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite){
        _iUniversiteService.updateUniversite(universite);
        return universite;
    }
    @PutMapping("/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite,@PathVariable Integer idDepartement) {
        _iUniversiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
}
