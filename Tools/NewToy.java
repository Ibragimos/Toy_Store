package T.Tools;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NewToy {
    public static void addNewToy(PriorityQueue<Toy> toyQueue, Scanner scanner) {
        System.out.print("Enter the name of the new toy: ");
        String name = scanner.nextLine();
        Toy newToy = new Toy(name);
        toyQueue.add(newToy);
        System.out.println("The toy " + name + " was added successfully!");
    }
}
