package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team2_directors", schema = "booking_cinema", catalog = "")
public class Team2DirectorsEntity {
    private String idDirector;
    private String name;
    private Integer born;
    private String career;

    @Id
    @Column(name = "id_director")
    public String getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
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

        Team2DirectorsEntity that = (Team2DirectorsEntity) o;

        if (idDirector != null ? !idDirector.equals(that.idDirector) : that.idDirector != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (born != null ? !born.equals(that.born) : that.born != null) return false;
        if (career != null ? !career.equals(that.career) : that.career != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDirector != null ? idDirector.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (born != null ? born.hashCode() : 0);
        result = 31 * result + (career != null ? career.hashCode() : 0);
        return result;
    }
}
