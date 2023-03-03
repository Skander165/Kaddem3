package com.example.kaddem3.Models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailsEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

    private int idDetailsEquipe;
    private int salle;
    private String thematique;

    @OneToOne
    private Equipe equipe;
}
