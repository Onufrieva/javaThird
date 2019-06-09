package model.dao.mysql;

import model.dao.TicketDao;
import model.dto.TicketListDto;
import model.entity.Schedule;
import model.entity.Ticket;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MySQLTicketDao {
//    private Connection connection;
//    private ResourceBundle sql = ResourceBundle.getBundle("sql");
//
//
//    public MySQLTicketDao(Connection connection) {
//        this.connection = connection;
//    }
//
//    @Override
//    public void create(Ticket entity) {
//        String query = sql.getString("INSERT_TICKET");
//        try(PreparedStatement statement = connection.prepareStatement(query)){
//
//            statement.setInt(1, entity.getIdSchedule());
//            statement.setInt(2, entity.getIdUser());
//
//            statement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public int getLastId() {
//        String query = sql.getString("GET_LAST_TICKET_ID");
//        int id = 0;
//        try(Statement statement = connection.prepareStatement(query)) {
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                id = resultSet.getInt(1);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return id;
//    }
//
//    public List<TicketListDto> getUserTicketsPage(int offset, int userID) {
//        List<TicketListDto> dtos = new ArrayList<>();
//        final String query = sql.getString("USER_TICKETS");
//        try(PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setInt(1, userID);
//            statement.setInt(2, offset);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int ticketId = resultSet.getInt("id_ticket");
//                Time timeStarted = resultSet.getTime("timeStarted");
//                String filmName = resultSet.getString("name_film");
//                String weekdayName = resultSet.getString("name_weekday");
//                Date date = resultSet.getDate("date");
//
//
//                Ticket ticket = new Ticket.Builder()
//                        .setIdUser(userID)
//                        .setIdTicket(ticketId)
//                        .build();
//                Schedule schedule = new Schedule.Builder()
//                        .setDate(date)
//                        .setFilmName(filmName)
//                        .setTimeStarted(timeStarted)
//                        .setWeekdayName(weekdayName)
//
//                        .build();
//
//                dtos.add(new TicketListDto(ticket, schedule));
//            }
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//        }
//        return dtos;
//    }
//
//    @Override
//    public int countRows(int userID) {
//        int rows = 0;
//        final String query = sql.getString("GET_ROWS_TICKET");
//        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setLong(1, userID);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                rows = resultSet.getInt(1);
//
//            }
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//        }
//
//        return rows;
//    }
//
//
//    @Override
//    public Ticket findById(int id) {
//        return null;
//    }
//
//    @Override
//    public List<Ticket> findAll() {
//        return null;
//    }
//
//    @Override
//    public void update(Ticket entity) {
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
}
