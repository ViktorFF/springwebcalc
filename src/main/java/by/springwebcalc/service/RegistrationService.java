package by.springwebcalc.service;

import by.springwebcalc.model.User;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RegistrationService {
    public String registration(String nickname, String login, String password, Map<String, User> users) {
        if (users.isEmpty()) {
            users.put(login, new User(nickname, login, password));
            return "index";
        }

        for (String key: users.keySet()) {
            if (key.equals(login)) {
                return "reg";
            }
        }
        users.put(login, new User(nickname, login, password));
        return "index";
    }
}
