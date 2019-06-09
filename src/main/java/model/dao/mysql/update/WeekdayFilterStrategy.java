package model.dao.mysql.update;

public class WeekdayFilterStrategy implements Strategy {
    @Override
    public String getKey() {
        return "FIND_ALL_SCHEDULE";
    }
}
