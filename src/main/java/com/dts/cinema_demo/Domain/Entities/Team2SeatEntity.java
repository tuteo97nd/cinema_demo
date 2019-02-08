package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team2_seat", schema = "booking_cinema", catalog = "")
public class Team2SeatEntity {
    private String idSeat;
    private String rowSeat;
    private int numberSeat;
    private String idRoom;
    private String idScreening;
    private int active;

    @Id
    @Column(name = "id_seat")
    public String getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(String idSeat) {
        this.idSeat = idSeat;
    }

    @Basic
    @Column(name = "row_seat")
    public String getRowSeat() {
        return rowSeat;
    }

    public void setRowSeat(String rowSeat) {
        this.rowSeat = rowSeat;
    }

    @Basic
    @Column(name = "number_seat")
    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
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
    @Column(name = "id_screening")
    public String getIdScreening() {
        return idScreening;
    }

    public void setIdScreening(String idScreening) {
        this.idScreening = idScreening;
    }

    @Basic
    @Column(name = "active")
    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2SeatEntity that = (Team2SeatEntity) o;

        if (numberSeat != that.numberSeat) return false;
        if (active != that.active) return false;
        if (idSeat != null ? !idSeat.equals(that.idSeat) : that.idSeat != null) return false;
        if (rowSeat != null ? !rowSeat.equals(that.rowSeat) : that.rowSeat != null) return false;
        if (idRoom != null ? !idRoom.equals(that.idRoom) : that.idRoom != null) return false;
        if (idScreening != null ? !idScreening.equals(that.idScreening) : that.idScreening != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSeat != null ? idSeat.hashCode() : 0;
        result = 31 * result + (rowSeat != null ? rowSeat.hashCode() : 0);
        result = 31 * result + numberSeat;
        result = 31 * result + (idRoom != null ? idRoom.hashCode() : 0);
        result = 31 * result + (idScreening != null ? idScreening.hashCode() : 0);
        result = 31 * result + active;
        return result;
    }
}
