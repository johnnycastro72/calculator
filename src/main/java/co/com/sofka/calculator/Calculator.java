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

    static Integer product( Integer n, Integer m ) {
        return (m != 0) ? sum.calculate(n, product(n, m-1)) : 0; // recursive call
    }


    public static void main(String[] args) {

        System.out.println("Sum: " + sum.calculate(5,4));
        System.out.println("Subtract: " + subtract.calculate(10,5));
        System.out.println("Product: " + product(6,6));

    }
}
