package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Echipa_Sport", schema = "AplicatieEchipeStudenti")
public class EchipaSport {
    @EmbeddedId
    private EchipaSportId id;

    @MapsId("idEchipa")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_echipa", nullable = false)
    private Echipa idEchipa;

    @MapsId("idSport")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_sport", nullable = false)
    private com.project.StudentsTeamsProject.Sporturi idSport;

    @Column(name = "Numar_Jucatori", nullable = false)
    private Integer numarJucatori;

    @Column(name = "Antrenor_Secund", length = 100)
    private String antrenorSecund;

}