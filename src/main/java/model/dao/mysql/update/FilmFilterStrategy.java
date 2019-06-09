package model.dao.mysql.update;

public class FilmFilterStrategy implements Strategy {
    @Override
    public String getKey() {
        return "FIND_ALL_SCHEDULE";
    }
}
