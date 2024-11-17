package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Universitate", schema = "AplicatieEchipeStudenti")
public class Universitate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_universitate", nullable = false)
    private Integer id;

    @Column(name = "Nume_Universitate", nullable = false, length = 100)
    private String numeUniversitate;

    @Column(name = "Rector", nullable = false, length = 100)
    private String rector;

    @Column(name = "Telefon", nullable = false, length = 10)
    private String telefon;

    @Column(name = "Adresa", nullable = false, length = 100)
    private String adresa;

}