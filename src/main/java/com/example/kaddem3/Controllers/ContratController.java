package com.example.kaddem3.Controllers;

import com.example.kaddem3.Models.Contrat;
import com.example.kaddem3.Services.IContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contrat")
@RequiredArgsConstructor
public class ContratController {
    private final IContractService _iContractService;

    @GetMapping()
    public List<Contrat> getAllContracts(){
        return _iContractService.getAllContracts();
    }
    @GetMapping("/{id}")
    public Contrat getContractById(@PathVariable int id){
        return _iContractService.getContractById(id);
    }
    @DeleteMapping("/{id}")
    private void deleteContract(@PathVariable int id){
        _iContractService.deleteContract(id);
    }
    @PostMapping()
    public void addContract(@RequestBody Contrat contrat){
        _iContractService.addContract(contrat);
    }
    @PutMapping()
    private Contrat updateContract(@RequestBody Contrat contrat){
        _iContractService.updateContract(contrat);
        return contrat;
    }

    @PutMapping("/{nom}/{prenom}")
    public Contrat affectContratToEtudiant(@RequestBody Contrat ce, @PathVariable("nom") String nom , @PathVariable("prenom") String prenom) {
        return _iContractService.affectContratToEtudiant(ce ,nom ,prenom);
    }

}
