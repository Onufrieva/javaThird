package model.entity;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

import java.time.LocalTime;

public class Schedule {
    private int idSchedule;
    private int idWeekday;
    private int idFilm;
    private Time timeStarted;
    private Date date;

    private String filmName;
    private String weekdayName;

    public Schedule(Builder builder) {
        this.idSchedule = builder.idSchedule;
        this.idWeekday = builder.idWeekday;
        this.idFilm = builder.idFilm;
        this.timeStarted = builder.timeStarted;
        this.date = builder.date;
        this.filmName = builder.filmName;
        this.weekdayName = builder.weekdayName;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public int getIdWeekday() {
        return idWeekday;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public Time getTimeStarted() {
        return timeStarted;
    }

    public Date getDate() {
        return date;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getWeekdayName() {
        return weekdayName;
    }
    public static class Builder{
        private int idSchedule = 0;
        private int idWeekday = 0;
        private int idFilm = 0;
        private Time timeStarted = Time.valueOf(LocalTime.now());
        private Date date = Date.valueOf(LocalDate.now());


        private String filmName = "";
        private String weekdayName = "";

        public Builder setIdSchedule(int idSchedule) {
            this.idSchedule = idSchedule;
            return this;
        }

        public Builder setIdWeekday(int idWeekday) {
            this.idWeekday = idWeekday;
            return this;
        }

        public Builder setIdFilm(int idFilm) {
            this.idFilm = idFilm;
            return this;
        }

        public Builder setTimeStarted(Time timeStarted) {
            this.timeStarted = timeStarted;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }


        public Builder setFilmName(String filmName) {
            this.filmName = filmName;
            return this;
        }

        public Builder setWeekdayName(String weekdayName) {
            this.weekdayName = weekdayName;
            return this;
        }
        public Schedule build() {
            return new Schedule(this);
        }
    }
}
