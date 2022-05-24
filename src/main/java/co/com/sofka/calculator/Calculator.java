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

    static Integer divide( Integer n, Integer m, Integer s) {
        return (n > m) ? divide(subtract.calculate(n, m), m, ++s) : s+1;
    }

    static String resultDivide(Integer n, Integer m) {
        if (n.equals(0)) return "0";
        if (m.equals(0)) return "Error";
        return divide(n, m, 0).toString();
    }

    public static void main(String[] args) {

        System.out.println("Sum: " + sum.calculate(5,4));
        System.out.println("Subtract: " + subtract.calculate(10,5));
        System.out.println("Product: " + product(6,6));
        System.out.println("Divide 0/10: " + resultDivide(0,10));
        System.out.println("Divide 10/2: " + resultDivide(10,2));
        System.out.println("Divide 10/0: " + resultDivide(10,0));

    }
}
