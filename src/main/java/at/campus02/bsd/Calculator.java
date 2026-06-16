package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {
        logger.debug("add called with: " + number1 + ", " + number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        logger.debug("subtract called with: " + number1 + ", " + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            logger.error("Division by zero!");
            return 0;
        }
        logger.debug("divide called with: " + number1 + ", " + number2);
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("multiply called with: " + number1 + ", " + number2);
        return number1 * number2;
    }
}
