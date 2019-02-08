package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team2_movietheater", schema = "booking_cinema", catalog = "")
public class Team2MovietheaterEntity {
    private String idMovietheater;
    private String idScreen;
    private String address;
    private String nameMovietheater;

    @Id
    @Column(name = "id_movietheater")
    public String getIdMovietheater() {
        return idMovietheater;
    }

    public void setIdMovietheater(String idMovietheater) {
        this.idMovietheater = idMovietheater;
    }

    @Basic
    @Column(name = "id_screen")
    public String getIdScreen() {
        return idScreen;
    }

    public void setIdScreen(String idScreen) {
        this.idScreen = idScreen;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "name_movietheater")
    public String getNameMovietheater() {
        return nameMovietheater;
    }

    public void setNameMovietheater(String nameMovietheater) {
        this.nameMovietheater = nameMovietheater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2MovietheaterEntity that = (Team2MovietheaterEntity) o;

        if (idMovietheater != null ? !idMovietheater.equals(that.idMovietheater) : that.idMovietheater != null)
            return false;
        if (idScreen != null ? !idScreen.equals(that.idScreen) : that.idScreen != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (nameMovietheater != null ? !nameMovietheater.equals(that.nameMovietheater) : that.nameMovietheater != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMovietheater != null ? idMovietheater.hashCode() : 0;
        result = 31 * result + (idScreen != null ? idScreen.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (nameMovietheater != null ? nameMovietheater.hashCode() : 0);
        return result;
    }
}
