package by.springwebcalc.service;

import by.springwebcalc.model.User;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class AuthenticationService {
    public String authentication(String login, String password, HttpServletRequest req) {
        Map<String, User> users = (Map<String, User>) req.getServletContext().getAttribute("users");
        if (users.isEmpty()) {
            return "auth";
        }
        if (users.containsKey(login)) {
            if (users.get(login).getPassword().equals(password)) {
                req.getSession().setAttribute("currentUser", users.get(login));
                return "calculator";
            }
            return "auth";
        }
        return "auth";
    }
}
