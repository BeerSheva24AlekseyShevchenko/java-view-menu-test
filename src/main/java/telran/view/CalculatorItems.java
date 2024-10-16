package telran.view;

public class CalculatorItems {
    private static Calculator calculator;

    public static Item[] getItems(Calculator calculator) {
        CalculatorItems.calculator = calculator;
        Item[] res = {
            Item.of("add numbers", CalculatorItems::add),
            Item.of("subtract numbers", CalculatorItems::subtract),
            Item.of("multiply numbers", CalculatorItems::multiply),
            Item.of("divide numbers", CalculatorItems::divide),
            Item.ofExit()
        };

        return res;
    }

    static double[] enterNumbers(InputOutput io) {
        double op1 = io.readDouble("Enter number first", "Wrong number");
        double op2 = io.readDouble("Enter number second", "Wrong number");

        return new double[] { op1, op2 };
    }

    private static void add(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.add(numbers[0], numbers[1]));
    }

    private static void subtract(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.subtract(numbers[0], numbers[1]));
    }

    private static void multiply(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.multiply(numbers[0], numbers[1]));
    }

    private static void divide(InputOutput io) {
        double[] numbers = enterNumbers(io);
        io.writeLine(calculator.divide(numbers[0], numbers[1]));
    }

}
