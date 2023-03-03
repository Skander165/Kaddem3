package com.example.kaddem3.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private int id;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToOne(mappedBy = "equipe")
    private DetailsEquipe detailsEquipe;
    @ManyToMany
    @JsonIgnore
    private List<Etudiant> etudiants;


}
