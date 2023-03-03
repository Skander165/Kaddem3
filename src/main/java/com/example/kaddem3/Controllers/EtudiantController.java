package com.example.kaddem3.Controllers;

import com.example.kaddem3.Models.Etudiant;
import com.example.kaddem3.Services.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {
@Autowired
    private final IEtudiantService _iEtudiantService;

    @GetMapping()
    public List<Etudiant> getAll() {
        return _iEtudiantService.getAll();
    }

    @GetMapping("{id}")
    public Etudiant getById(@PathVariable int id) {
        return _iEtudiantService.getById(id);
    }

    @PostMapping()
    public void addEtudiant(@RequestBody Etudiant e) {
        _iEtudiantService.addEtudiant(e);
    }

    @PutMapping("{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId, @PathVariable Integer departementId) {
        _iEtudiantService.assignEtudiantToDepartement(etudiantId, departementId);
    }

    @PostMapping("{idContrat}/{idEquipe}")
    public Etudiant addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
        return _iEtudiantService.addAndAssignEtudiantToEquipeAndContract(e, idContrat, idEquipe);
    }
}