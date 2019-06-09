package model.entity;

import java.sql.Time;
import java.time.LocalTime;

public class Film {
    private int idFilm;
    private String nameFilm;
    private Time duration;

    public Film(Builder builder) {
        this.idFilm = builder.idFilm;
        this.nameFilm = builder.nameFilm;
        this.duration = builder.duration;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public Time getDuration() {
        return duration;
    }
    public static class Builder {
        private int idFilm = 0;
        private String nameFilm = "";
        private Time duration = Time.valueOf(LocalTime.now());

        public Builder setIdFilm(int idFilm) {
            this.idFilm = idFilm;
            return this;
        }

        public Builder setNameFilm(String nameFilm) {
            this.nameFilm = nameFilm;
            return this;
        }

        public Builder setDuration(Time duration) {
            this.duration = duration;
            return this;
        }
        public Film build() {
            return new Film(this);
        }
    }
}
