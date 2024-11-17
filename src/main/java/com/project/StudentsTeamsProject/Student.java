package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Student", schema = "AplicatieEchipeStudenti")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student", nullable = false)
    private Integer id;

    @Column(name = "Nume", nullable = false, length = 100)
    private String nume;

    @Column(name = "Prenume", nullable = false, length = 100)
    private String prenume;

    @Column(name = "Data_Nasterii", nullable = false)
    private LocalDate dataNasterii;

    @Column(name = "CNP", nullable = false, length = 13)
    private String cnp;

    @Column(name = "An_Studiu")
    private Integer anStudiu;

    @Column(name = "Telefon", length = 10)
    private String telefon;

    @ColumnDefault("'M'")
    @Column(name = "Sex", length = 1)
    private String sex;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_echipa")
    private Echipa idEchipa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_facultate")
    private Facultate idFacultate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_capitan")
    private Student idCapitan;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "parola", nullable = false, length = 100)
    private String parola;

}