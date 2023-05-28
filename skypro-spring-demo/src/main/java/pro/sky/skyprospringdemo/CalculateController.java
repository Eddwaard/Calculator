package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    private final Calculator calculator;

    public CalculateController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping(path = "/calculator")
    public String showHello(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2){
        return num1 + " + " + num2 + " = " + calculator.sum(num1,num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2){
        return num1 + " - " + num2 + " = " + calculator.min(num1,num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String mul(@RequestParam int num1, @RequestParam int num2){
        return num1 + " * " + num2 + " = " + calculator.mul(num1,num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String div(@RequestParam int num1, @RequestParam int num2){
        double result = calculator.div(num1, num2);
        if(result == 0){
            return "На ноль делить нельзя";
        }
        return num1 + " / " + num2 + " = " + result;
    }


}