package com.dts.cinema_demo.Domain.Entities;

import javax.persistence.*;

@Entity
@Table(name = "team2_categories", schema = "booking_cinema", catalog = "")
public class Team2CategoriesEntity {
    private String idCategory;
    private String nameType;
    private String description;

    @Id
    @Column(name = "id_category")
    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "name_type")
    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2CategoriesEntity that = (Team2CategoriesEntity) o;

        if (idCategory != null ? !idCategory.equals(that.idCategory) : that.idCategory != null) return false;
        if (nameType != null ? !nameType.equals(that.nameType) : that.nameType != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategory != null ? idCategory.hashCode() : 0;
        result = 31 * result + (nameType != null ? nameType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
