package com.project.StudentsTeamsProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "Sporturi", schema = "AplicatieEchipeStudenti")
public class Sporturi {
    @Id
    @Column(name = "id_sport", nullable = false)
    private Integer id;

    @Column(name = "Nume_Sport", nullable = false, length = 100)
    private String numeSport;

    @ColumnDefault("'Individual'")
    @Column(name = "Tip_Sport", length = 100)
    private String tipSport;

    @Column(name = "Durata_Repriza")
    private Integer durataRepriza;

    @Column(name = "Numar_Reprize")
    private Integer numarReprize;

}