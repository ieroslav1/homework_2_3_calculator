package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {


    public String welcome() {
        return welcome();
    }

    public int plusResults(int num1, int num2) {
        return num1 + num2;
    }

    public int minusResults(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyResults(int num1, int num2) {
        return num1 * num2;
    }

    public int divideResults(int num1, int num2) {
        return num1 / num2;
    }

}
