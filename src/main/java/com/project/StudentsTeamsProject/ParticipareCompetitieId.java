package com.project.StudentsTeamsProject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ParticipareCompetitieId implements java.io.Serializable {
    private static final long serialVersionUID = -6967540710272199791L;
    @Column(name = "id_echipa", nullable = false)
    private Integer idEchipa;

    @Column(name = "id_competitie", nullable = false)
    private Integer idCompetitie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ParticipareCompetitieId entity = (ParticipareCompetitieId) o;
        return Objects.equals(this.idEchipa, entity.idEchipa) &&
                Objects.equals(this.idCompetitie, entity.idCompetitie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEchipa, idCompetitie);
    }

}