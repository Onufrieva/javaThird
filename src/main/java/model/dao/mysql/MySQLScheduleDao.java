package model.dao.mysql;

import model.dao.ScheduleDao;
import model.dao.mysql.update.Update;
import model.entity.Schedule;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class MySQLScheduleDao  {
//    private Connection connection;
//    ResourceBundle sql = ResourceBundle.getBundle("sql");
//
//
//    public MySQLScheduleDao(Connection connection) {
//        this.connection = connection;
//    }
//
//    @Override
//    public void create(Schedule entity) {
//        final String query = sql.getString("CREATE_SCHEDULE");
//        try{
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setInt(1, entity.getIdSchedule());
//            statement.setInt(2, entity.getIdFilm());
//            statement.setTime(3, entity.getTimeStarted());
//            statement.setDate(4, entity.getDate());
//            statement.setInt(5, entity.getIdWeekday());
//
//            statement.executeUpdate();
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public Schedule findById(int id) {
//        Schedule e = null;
//
//        try( PreparedStatement statement = connection.prepareStatement(sql.getString("exhibition.getbyid"))) {
//            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int idSchedule = resultSet.getInt("id_schedule");
//                int idFilm = resultSet.getInt("id_film");
//                int idWeekday = resultSet.getInt("id_weekday");
//                Date date = resultSet.getDate("date");
//                Time timeStarted = resultSet.getTime("timeStarted");
//                String filmName = resultSet.getString("name_film");
//
//
//
//
//
//                e = new Schedule.Builder()
//                        .setIdSchedule(idSchedule)
//                        .setIdWeekday(idWeekday)
//                        .setIdFilm(idFilm)
//                        .setTimeStarted(timeStarted)
//                        .setDate(date)
//                        .setFilmName(filmName)
//                        .build();
//            }
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            try{
//                connection.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//        return e;
//    }
//
//    @Override
//    public List<Schedule> findAll() {
//        List<Schedule> scheduleList = new ArrayList<>();
//
//        return scheduleList;
//    }
//
//    @Override
//    public void update(Schedule entity) {
//
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//
//    @Override
//    public void close() {
//
//    }
//
//    @Override
//    public List<Schedule> getSearchSchedule(int idFilmParam, int idWeekdayParam) {
//        List<Schedule> scheduleList = new ArrayList<>();
//        int counter = 1;
//        Update update= new Update();
//        update.setStrategy(idFilmParam, idWeekdayParam);
//        final String query = sql.getString(update.execute());
//
//        try{
//            PreparedStatement statement = connection.prepareStatement(query);
//            if(idFilmParam != 0) {
//                statement.setInt(counter, idFilmParam);
//                counter++;
//            }
//            if(idWeekdayParam != 0) {
//                statement.setInt(counter, idWeekdayParam);
//                counter++;
//            }
//
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id_schedule");
//                int idFilm = resultSet.getInt("id_film");
//                int idWeekday = resultSet.getInt("id_weekday");
//
//                Time timeStarted = resultSet.getTime("timeStarted");
//                String filmName = resultSet.getString("name_film");
//                String weekdayName = resultSet.getString("name_weekday");
//
//
//                Date date = resultSet.getDate("date");
//
//                Schedule schedule = new Schedule.Builder()
//                        .setIdSchedule(id)
//                        .setIdWeekday(idWeekday)
//                        .setIdFilm(idFilm)
//                        .setTimeStarted(timeStarted)
//                        .setDate(date)
//                        .setFilmName(filmName)
//                        .setWeekdayName(weekdayName)
//                        .build();
//                scheduleList.add(schedule);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return scheduleList;
//    }
}
