package co.com.sofka.calculator;

public class Calculator {

    static IOperation sum = (a,b) -> {
        Integer c = a+b;
        return c;
    };

    public static void main(String[] args) {

        System.out.println("Sum: " + sum.calculate(5,4));

    }
}
