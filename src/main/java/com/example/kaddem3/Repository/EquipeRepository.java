package com.example.kaddem3.Repository;

import com.example.kaddem3.Models.Equipe;
import com.example.kaddem3.Models.Option;
import com.example.kaddem3.Models.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
    List<Equipe> findByEtudiantsOptionAndEtudiantsContratsSpecialite(Option op, Specialite sp);
}
