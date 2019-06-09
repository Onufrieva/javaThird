package controller.commands;

import model.entity.Film;
import model.service.AdminService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Time;

public class NewFilmCommand implements Command{



        @Override
        public String execute(HttpServletRequest request) {
            String name = request.getParameter("filmname");
            Time duration = Time.valueOf(request.getParameter("duration"));

            Film film = new Film.Builder()
                    .setNameFilm(name)
                    .setDuration(duration)
                    .build();

            AdminService service = new AdminService();
            service.newFilm(film);

            return "redirect: /admin";
        }


}
