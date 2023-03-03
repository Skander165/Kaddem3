package com.example.kaddem3.Models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idDepartement;
    private String nom;
    @OneToMany(mappedBy = "departement")
    private List<Etudiant> etudiants;




}
