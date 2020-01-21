package by.springwebcalc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    @GetMapping
    public ModelAndView historyGet(HttpServletRequest req, ModelAndView model) {
        List<String> history = (List<String>) req.getSession().getAttribute("history");
        boolean historyFlag = true;
        if (!history.isEmpty()) {
            historyFlag = false;
        }
        model.setViewName("history");
        model.addObject("history", history);
        model.addObject("historyFlag", historyFlag);
        return model;
    }
}
