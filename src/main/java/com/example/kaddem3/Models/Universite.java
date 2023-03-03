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
public class Universite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Id
    private int idUniversité;
    private String nom;
    @OneToMany
    private List<Departement> Departements;
}
