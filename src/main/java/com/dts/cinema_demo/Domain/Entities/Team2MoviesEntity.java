package com.dts.cinema_demo.Domain.Entities;

import com.dts.cinema_demo.Domain.Request.MoviesMapMoviesTheater;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "team2_movies", schema = "booking_cinema", catalog = "")
@SqlResultSetMappings(
        @SqlResultSetMapping(name = "MoviesMapMoviesTheater",
                classes = @ConstructorResult(
                        targetClass = MoviesMapMoviesTheater.class,
                        columns = {
                                @ColumnResult(name = "id_movie", type = String.class),
                                @ColumnResult(name = "name_movie", type = String.class),
                                @ColumnResult(name = "description_movie", type = String.class),
                                @ColumnResult(name = "trailer", type = String.class),
                                @ColumnResult(name = "id_actor", type = String.class),
                                @ColumnResult(name = "id_director", type = String.class),
                                @ColumnResult(name = "id_category", type = String.class),
                                @ColumnResult(name = "age_watch", type = String.class),
                                @ColumnResult(name = "date_start", type = Timestamp.class),
                                @ColumnResult(name = "duration", type = int.class),
                                @ColumnResult(name = "language", type = String.class),
                                @ColumnResult(name = "id_screen", type = String.class),
                                @ColumnResult(name = "id_room", type = String.class),
                                @ColumnResult(name = "screening_start", type = Timestamp.class)
                        }
                ))
)
public class Team2MoviesEntity {
    private String idMovie;
    private String nameMovie;
    private String descriptionMovie;
    private String trailer;
    private String idActor;
    private String idDirector;
    private String idCategory;
    private String ageWatch;
    private Timestamp dateStart;
    private int duration;
    private String language;

    @Id
    @Column(name = "id_movie")
    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    @Basic
    @Column(name = "name_movie")
    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    @Basic
    @Column(name = "description_movie")
    public String getDescriptionMovie() {
        return descriptionMovie;
    }

    public void setDescriptionMovie(String descriptionMovie) {
        this.descriptionMovie = descriptionMovie;
    }

    @Basic
    @Column(name = "trailer")
    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Basic
    @Column(name = "id_actor")
    public String getIdActor() {
        return idActor;
    }

    public void setIdActor(String idActor) {
        this.idActor = idActor;
    }

    @Basic
    @Column(name = "id_director")
    public String getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
    }

    @Basic
    @Column(name = "id_category")
    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "age_watch")
    public String getAgeWatch() {
        return ageWatch;
    }

    public void setAgeWatch(String ageWatch) {
        this.ageWatch = ageWatch;
    }

    @Basic
    @Column(name = "date_start")
    public Timestamp getDateStart() {
        return dateStart;
    }

    public void setDateStart(Timestamp dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team2MoviesEntity that = (Team2MoviesEntity) o;

        if (duration != that.duration) return false;
        if (idMovie != null ? !idMovie.equals(that.idMovie) : that.idMovie != null) return false;
        if (nameMovie != null ? !nameMovie.equals(that.nameMovie) : that.nameMovie != null) return false;
        if (descriptionMovie != null ? !descriptionMovie.equals(that.descriptionMovie) : that.descriptionMovie != null)
            return false;
        if (trailer != null ? !trailer.equals(that.trailer) : that.trailer != null) return false;
        if (idActor != null ? !idActor.equals(that.idActor) : that.idActor != null) return false;
        if (idDirector != null ? !idDirector.equals(that.idDirector) : that.idDirector != null) return false;
        if (idCategory != null ? !idCategory.equals(that.idCategory) : that.idCategory != null) return false;
        if (ageWatch != null ? !ageWatch.equals(that.ageWatch) : that.ageWatch != null) return false;
        if (dateStart != null ? !dateStart.equals(that.dateStart) : that.dateStart != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMovie != null ? idMovie.hashCode() : 0;
        result = 31 * result + (nameMovie != null ? nameMovie.hashCode() : 0);
        result = 31 * result + (descriptionMovie != null ? descriptionMovie.hashCode() : 0);
        result = 31 * result + (trailer != null ? trailer.hashCode() : 0);
        result = 31 * result + (idActor != null ? idActor.hashCode() : 0);
        result = 31 * result + (idDirector != null ? idDirector.hashCode() : 0);
        result = 31 * result + (idCategory != null ? idCategory.hashCode() : 0);
        result = 31 * result + (ageWatch != null ? ageWatch.hashCode() : 0);
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + duration;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
