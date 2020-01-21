package by.springwebcalc.service;

import by.springwebcalc.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Component
public class CalculatorService {
    private Calculator calculator;

    @Autowired
    private CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public String calculate(String firstElement, String secondElement,
                            String operation, List<String> history) {
        double result = 0;
        double var1 = Double.parseDouble(firstElement);
        double var2 = Double.parseDouble(secondElement);

        switch (operation) {
            case "sum" :
                result = calculator.sum(var1, var2);
                break;
            case "sub":
                result = calculator.sub(var1, var2);
                break;
            case "mult":
                result = calculator.multiple(var1, var2);
                break;
            case "div":
                result = calculator.div(var1, var2);
                break;
        }
        history.add(new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss", Locale.ENGLISH).format(new Date()) +
                " : " + var1 + " " + operation + " " + var2 + " = " + result);
        return String.valueOf(result);
    }
}
