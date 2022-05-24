package co.com.sofka.calculator;

public class Calculator {

    static IOperation sum = (a,b) -> {
        Integer c = a+b;
        return c;
    };

    static IOperation subtract = (a,b) -> {
        Integer c = a-b;
        return c;
    };


    public static void main(String[] args) {

        System.out.println("Sum: " + sum.calculate(5,4));
        System.out.println("Subtract: " + subtract.calculate(10,5));

    }
}
