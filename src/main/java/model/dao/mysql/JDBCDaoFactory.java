package model.dao.mysql;

import model.dao.*;
import org.apache.log4j.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;



public class JDBCDaoFactory extends DaoFactory {

    private DataSource dataSource = MySQLConnectionPoolHolder.getDataSource();

    private Connection getConnection() {
        try{
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

//    @Override
//    public CategoryDao createCategoryDao() {
//        return new MySQLCategoryDao(getConnection());
//    }
//
    @Override
    public FilmDao createFilmDao() {
        return new MySQLFilmDao(getConnection());
    }
//
//    @Override
//    public ScheduleDao createScheduleDao() {
//        return new MySQLScheduleDao(getConnection());
//    }
////
//    @Override
//    public TicketDao createTicketDao() {
//        return new MySQLTicketDao(getConnection());
//    }

    @Override
    public UserDao createUserDao() {
        return new MySQLUserDao(getConnection());
    }


//    @Override
//    public PaymentDao createPaymentDao() {
//        return new MySQLPaymentDao(getConnection());
//    }
}
