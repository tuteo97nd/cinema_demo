package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "team2_screening", schema = "booking_cinema", catalog = "")
public class Team2ScreeningEntity {
    private String idScreen;
    private String idMovie;
    private String idRoom;
    private Timestamp screeningStart;

    @Id
    @Column(name = "id_screen")
    public String getIdScreen() {
        return idScreen;
    }

    public void setIdScreen(String idScreen) {
        this.idScreen = idScreen;
    }

    @Basic
    @Column(name = "id_movie")
    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    @Basic
    @Column(name = "id_room")
    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Basic
    @Column(name = "screening_start")
    public Timestamp getScreeningStart() {
        return screeningStart;
    }

    public void setScreeningStart(Timestamp screeningStart) {
        this.screeningStart = screeningStart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2ScreeningEntity that = (Team2ScreeningEntity) o;

        if (idScreen != null ? !idScreen.equals(that.idScreen) : that.idScreen != null) return false;
        if (idMovie != null ? !idMovie.equals(that.idMovie) : that.idMovie != null) return false;
        if (idRoom != null ? !idRoom.equals(that.idRoom) : that.idRoom != null) return false;
        if (screeningStart != null ? !screeningStart.equals(that.screeningStart) : that.screeningStart != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idScreen != null ? idScreen.hashCode() : 0;
        result = 31 * result + (idMovie != null ? idMovie.hashCode() : 0);
        result = 31 * result + (idRoom != null ? idRoom.hashCode() : 0);
        result = 31 * result + (screeningStart != null ? screeningStart.hashCode() : 0);
        return result;
    }
}
