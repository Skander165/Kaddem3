package com.example.kaddem3.Controllers;

import com.example.kaddem3.Models.Departement;
import com.example.kaddem3.Services.IDepartementService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("departement")
@RequiredArgsConstructor
public class DepartementController {
    private final IDepartementService _iDepartementService;

    @GetMapping()
    public List<Departement> getAllDepartments(){
        return _iDepartementService.getAllDepartments();
    }
    @GetMapping("{id}")
    public Departement getDepartmentById(@PathVariable int id){
        return _iDepartementService.getDepartmentById(id);
    }
    @DeleteMapping("{id}")
    private void deleteDepartment(@PathVariable int id){
        _iDepartementService.deleteDepartment(id);
    }
    @PostMapping()
    public void addDepartment(@RequestBody Departement departement){
        _iDepartementService.addDepartment(departement);
    }
    @PutMapping()
    private Departement updateDepartment(@RequestBody Departement departement){
        _iDepartementService.updateDepartment(departement);
        return departement;
    }

}

