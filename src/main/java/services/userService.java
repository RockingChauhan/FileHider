package services;

import DAO.userDAO;
import model.user;

import java.sql.SQLException;

public class userService {
    public static Integer saveUser(user user){
        try {
            if(userDAO.isExists(user.getEmail())) {
                return 0;
            } else {
                return userDAO.saveUser(user);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
