package telran.view.test;

import telran.view.CalculatorItems;
import telran.view.InputOutput;
import telran.view.Item;
import telran.view.Menu;
import telran.view.SimpleCalculator;
import telran.view.StandardIO;

public class Main {
    public static void main(String[] args) {
        InputOutput io = new StandardIO();
        Item[] items = CalculatorItems.getItems(new SimpleCalculator());
        Menu menu = new Menu(items);
        menu.perform(io);
    }
}