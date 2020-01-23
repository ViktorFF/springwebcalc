package by.springwebcalc.service;

import by.springwebcalc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserService {
    private Map<String, User> users;

    @Autowired
    public UserService(Map<String, User> users) {
        this.users = users;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public boolean registration(User newUser) {
        if (users.isEmpty()) {
            users.put(newUser.getLogin(), newUser);
            return true;
        }

        for (String key: users.keySet()) {
            if (key.equals(newUser.getLogin())) {
                return false;
            }
        }
        users.put(newUser.getLogin(), newUser);
        return true;
    }

    public User authentication(User newUser) {
        String login = newUser.getLogin();
        String password = newUser.getPassword();
        if (users.isEmpty()) {
            return null;
        }
        if (users.containsKey(login)) {
            if (users.get(login).getPassword().equals(password))
            return users.get(login);
        }
        return null;
    }

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


