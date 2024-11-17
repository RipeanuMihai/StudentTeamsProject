package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Competitii", schema = "AplicatieEchipeStudenti")
public class Competitii {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competitie", nullable = false)
    private Integer id;

    @Column(name = "Nume_Competitie", nullable = false, length = 100)
    private String numeCompetitie;

    @Column(name = "Data_Inceput", nullable = false)
    private LocalDate dataInceput;

    @Column(name = "Data_Sfarsit", nullable = false)
    private LocalDate dataSfarsit;

    @Column(name = "Locatie", nullable = false, length = 100)
    private String locatie;

    @ColumnDefault("'Nationala'")
    @Column(name = "Tip_Competitie", length = 100)
    private String tipCompetitie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sport")
    private com.project.StudentsTeamsProject.Sporturi idSport;

}