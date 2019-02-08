package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team2_room", schema = "booking_cinema", catalog = "")
public class Team2RoomEntity {
    private String idRoom;
    private String nameRoom;
    private int seatNo;

    @Id
    @Column(name = "id_room")
    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    @Basic
    @Column(name = "name_room")
    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    @Basic
    @Column(name = "seat_no")
    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2RoomEntity that = (Team2RoomEntity) o;

        if (seatNo != that.seatNo) return false;
        if (idRoom != null ? !idRoom.equals(that.idRoom) : that.idRoom != null) return false;
        if (nameRoom != null ? !nameRoom.equals(that.nameRoom) : that.nameRoom != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRoom != null ? idRoom.hashCode() : 0;
        result = 31 * result + (nameRoom != null ? nameRoom.hashCode() : 0);
        result = 31 * result + seatNo;
        return result;
    }
}
