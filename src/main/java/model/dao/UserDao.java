package model.dao;

import model.entity.User;

public interface UserDao extends GenericDao<User> {
    User findByLogin(String login);
}
