package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping(path = "/plus")
    public String plusResults(@RequestParam(required = false) Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Все поля должны быть заполнены!";
        }
        return num1 + " + " + num2 + " = " + calcService.plusResults(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusResults(@RequestParam(required = false) Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Все поля должны быть заполнены!";
        }
        return num1 + " - " + num2 + " = " + calcService.minusResults(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyResults(@RequestParam(required = false) Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Все поля должны быть заполнены!";
        }
        return num1 + " * " + num2 + " = " + calcService.multiplyResults(num1, num2);
    }


    @GetMapping(path = "/divide")
    public String divideResults(@RequestParam(required = false) Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Все поля должны быть заполнены!";
        }
        if (num2 == 0) {
            return "Делить на ноль нельзя!";
        }
        return num1 + " / " + num2 + " = " + calcService.divideResults(num1, num2);
    }

}
