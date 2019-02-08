package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "team2_ticket", schema = "booking_cinema", catalog = "")
public class Team2TicketEntity {
    private String idTicket;
    private String idScreen;
    private double priceTicket;
    private Timestamp timeCreate;

    @Id
    @Column(name = "id_ticket")
    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
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
    @Column(name = "price_ticket")
    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    @Basic
    @Column(name = "time_create")
    public Timestamp getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Timestamp timeCreate) {
        this.timeCreate = timeCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2TicketEntity that = (Team2TicketEntity) o;

        if (Double.compare(that.priceTicket, priceTicket) != 0) return false;
        if (idTicket != null ? !idTicket.equals(that.idTicket) : that.idTicket != null) return false;
        if (idScreen != null ? !idScreen.equals(that.idScreen) : that.idScreen != null) return false;
        if (timeCreate != null ? !timeCreate.equals(that.timeCreate) : that.timeCreate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idTicket != null ? idTicket.hashCode() : 0;
        result = 31 * result + (idScreen != null ? idScreen.hashCode() : 0);
        temp = Double.doubleToLongBits(priceTicket);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (timeCreate != null ? timeCreate.hashCode() : 0);
        return result;
    }
}
