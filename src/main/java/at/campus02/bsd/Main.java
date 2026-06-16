package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));

        System.out.println("Melisa Gashi");

        logger.info("Info Message");
        logger.error("Error Message");
    }
}
