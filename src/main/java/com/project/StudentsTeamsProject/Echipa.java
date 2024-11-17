package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Echipa", schema = "AplicatieEchipeStudenti")
public class Echipa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_echipa", nullable = false)
    private Integer idEchipa;

    @Column(name = "Nume_Echipa", nullable = false, length = 100)
    private String numeEchipa;

    @Column(name = "Antrenor_Principal", length = 100)
    private String antrenorPrincipal;

    @Column(name = "Numar_Jucatori", nullable = false)
    private Integer numarJucatori;

    @Column(name = "Culori_Echipa", length = 100)
    private String culoriEchipa;

}