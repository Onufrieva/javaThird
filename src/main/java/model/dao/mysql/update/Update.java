package model.dao.mysql.update;

import java.util.HashMap;
import java.util.Map;


public class Update {
    private Strategy strategy;

    private Map<Integer, Strategy> strategyMap = new HashMap<>();

    {
        strategyMap.put(0, new NoFilterStrategy());
        strategyMap.put(1, new FilmFilterStrategy());
        strategyMap.put(2, new WeekdayFilterStrategy());
        strategyMap.put(3, new FilmWeekdayFilterStrategy());
    }

    public void setStrategy(long idHall, long idCat) {
        this.strategy = strategyMap.get(getState(idHall, idCat));
    }

    private int getState(long idHall, long idCat) {
        int state = 0;
        if(idHall !=0) {
            state = state+1;
        }
        if(idCat != 0) {
            state = state+2;
        }
        return state;
    }

    public String execute() {
        return strategy.getKey();
    }





}
