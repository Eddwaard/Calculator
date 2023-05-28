package pro.sky.skyprospringdemo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double min(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        if(checkDivByZero(b)){
            return 0;
        }
        return a / b;
    }

    private boolean checkDivByZero(double b){
        return b==0;
    }
}