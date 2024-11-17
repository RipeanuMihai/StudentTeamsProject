package com.project.StudentsTeamsProject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Participare_Competitie", schema = "AplicatieEchipeStudenti")
public class ParticipareCompetitie {
    @EmbeddedId
    private ParticipareCompetitieId id;

    @MapsId("idEchipa")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_echipa", nullable = false)
    private Echipa idEchipa;

    @MapsId("idCompetitie")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_competitie", nullable = false)
    private Competitii idCompetitie;

    @Column(name = "Pozitie_Obtinuta", nullable = false)
    private Integer pozitieObtinuta;

}