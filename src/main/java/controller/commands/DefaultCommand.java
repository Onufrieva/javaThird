package controller.commands;

import javax.servlet.http.HttpServletRequest;



public class DefaultCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        return "/index.jsp";
    }
}
