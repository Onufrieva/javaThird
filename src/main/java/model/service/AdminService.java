package model.service;


import model.dao.DaoFactory;

import model.dao.FilmDao;

import model.entity.Film;
import org.apache.log4j.Logger;



public class AdminService {
    private static final Logger log = Logger.getLogger(AdminService.class);
//
//    public int newCat(Category cat) {
//        try{
//            DaoFactory factory = DaoFactory.getInstance();
//            CategoryDao dao = factory.createCategoryDao();
//            dao.create(cat);
//        } catch (Exception e) {
//            log.error("Exception: " + e.getMessage());
//            return 0;
//        }
//        return 1;
//    }

    public int newFilm(Film film) {
        try{
            DaoFactory factory = DaoFactory.getInstance();
            FilmDao dao = factory.createFilmDao();
            dao.create(film);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
            return 0;
        }
        return 1;
    }

//    public int newExhibition(Exhibition exhibition) {
//        try{
//            DaoFactory factory = DaoFactory.getInstance();
//            ExhibitionDao dao = factory.createExhibitionDao();
//            dao.create(exhibition);
//        } catch (Exception e) {
//            log.error("Exception: " + e.getMessage());
//            return 0;
//        }
//        return 1;
//    }

}
