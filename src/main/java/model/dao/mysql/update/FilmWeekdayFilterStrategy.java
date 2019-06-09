package model.dao.mysql.update;

public class FilmWeekdayFilterStrategy implements Strategy {
    @Override
    public String getKey() {
        return "FIND_ALL_SCHEDULE";
    }
}
