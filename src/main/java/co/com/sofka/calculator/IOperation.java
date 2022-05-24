package co.com.sofka.calculator;

/**
 * This interface defines the agreement to create an operation
 *
 * @version 1.0.0 23/05/2022
 * @author Jhonny Castro johnny.castro@misena.edu.co
 * @since 1.0.0
 */
@FunctionalInterface
public interface IOperation {
    public Integer calculate (Integer a, Integer b);
}
