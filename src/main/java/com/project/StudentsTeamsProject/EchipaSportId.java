package com.project.StudentsTeamsProject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serial;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class EchipaSportId implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 2706578949157904896L;
    @Column(name = "id_echipa", nullable = false)
    private Integer idEchipa;

    @Column(name = "id_sport", nullable = false)
    private Integer idSport;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EchipaSportId entity = (EchipaSportId) o;
        return Objects.equals(this.idSport, entity.idSport) &&
                Objects.equals(this.idEchipa, entity.idEchipa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSport, idEchipa);
    }

}