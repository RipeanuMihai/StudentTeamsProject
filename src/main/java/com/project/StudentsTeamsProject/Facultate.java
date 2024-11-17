package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Facultate", schema = "AplicatieEchipeStudenti")
public class Facultate {
    @Id
    @Column(name = "id_facultate", nullable = false)
    private Integer idFacultate;

    @Column(name = "Nume_Facultate", nullable = false, length = 100)
    private String numeFacultate;

    @Column(name = "Decan", length = 100)
    private String decan;

    @Column(name = "Locatie", nullable = false, length = 100)
    private String locatie;

    @Column(name = "Telefon", nullable = false, length = 10)
    private String telefon;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_universitate", nullable = false)
    private com.project.StudentsTeamsProject.Universitate idUniversitate;

}