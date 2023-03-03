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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEtudiant;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private Option option;

    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats;

  @ManyToOne
  private Departement departement;

    @ManyToMany(mappedBy = "etudiants")
    private List<Equipe> equipes;



}
