package com.example.kaddem3.Repository;

import com.example.kaddem3.Models.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Departement, Integer> {

}
