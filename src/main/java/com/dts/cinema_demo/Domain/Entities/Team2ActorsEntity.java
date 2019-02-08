package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team2_actors", schema = "booking_cinema", catalog = "")
public class Team2ActorsEntity {
    private String idActor;
    private String name;
    private Integer born;
    private String career;

    @Id
    @Column(name = "id_actor")
    public String getIdActor() {
        return idActor;
    }

    public void setIdActor(String idActor) {
        this.idActor = idActor;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "born")
    public Integer getBorn() {
        return born;
    }

    public void setBorn(Integer born) {
        this.born = born;
    }

    @Basic
    @Column(name = "career")
    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2ActorsEntity that = (Team2ActorsEntity) o;

        if (idActor != null ? !idActor.equals(that.idActor) : that.idActor != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (born != null ? !born.equals(that.born) : that.born != null) return false;
        if (career != null ? !career.equals(that.career) : that.career != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActor != null ? idActor.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (born != null ? born.hashCode() : 0);
        result = 31 * result + (career != null ? career.hashCode() : 0);
        return result;
    }
}
