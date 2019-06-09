package model.dao.mysql;

import model.dao.FilmDao;
import model.dao.GenericDao;
import model.entity.Film;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MySQLFilmDao implements FilmDao {
    private Connection connection;
    ResourceBundle sql = ResourceBundle.getBundle("sql");
    private static final Logger log = Logger.getLogger(MySQLFilmDao.class);

    public MySQLFilmDao(Connection connection) {

        this.connection = connection;
    }

    @Override
    public void create(Film entity) {
        final String query = sql.getString("CREATE_HALL");
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, entity.getNameFilm());
            statement.setTime(2, entity.getDuration());
            statement.executeUpdate();

        } catch (SQLException e) {
            log.error("SQL exception: " + e.getStackTrace().toString());
            e.printStackTrace();
        }
    }

    @Override
    public Film findById(int id) {
        return null;
    }

    @Override
    public List<Film> findAll() {
        List<Film> filmList = new ArrayList<>();
        final String query = sql.getString("FIND_ALL_HALL");
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameFilm = resultSet.getString("name_film");
                Time duration = Time.valueOf(resultSet.getString("duration"));

                Film film = new Film.Builder()
                        .setIdFilm(id)
                        .setNameFilm(nameFilm)
                        .setDuration(duration)
                        .build();
                filmList.add(film);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return filmList;
    }

    @Override
    public void update(Film entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() {

    }
}
