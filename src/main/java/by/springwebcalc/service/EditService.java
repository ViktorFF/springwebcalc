package by.springwebcalc.service;

import by.springwebcalc.model.User;
import org.springframework.stereotype.Component;

@Component
public class EditService {
    public String oldValue(String field, User user){
        switch (field) {
            case "nickname":
                return user.getNickname();
            case "login":
                return user.getLogin();
            case "password":
                return user.getPassword();
        }
        return "";
    }

    public void setNewValue(String field, String newValue, User user) {
        switch (field) {
            case "nickname":
                user.setNickname(newValue);
                break;
            case "login":
                user.setLogin(newValue);
                break;
            case "password":
                user.setPassword(newValue);
                break;
        }
    }
}
