package T.Tools;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ToyFrequency {
    public static void setToyFrequency(PriorityQueue<Toy> toyQueue, Scanner scanner) {
        System.out.println("List of all toys:");
        toyQueue.forEach(toy -> System.out.println(toy.getName()));
        System.out.print("Enter the name of the toy for which you want to set the weight: ");

        String name = scanner.nextLine();
        toyQueue.stream()
                .filter(toy -> toy.getName().equalsIgnoreCase(name))
                .findFirst()
                .ifPresent(toy -> {
                    System.out.print("Enter the weight for the toy " + name + ": ");
                    int frequency = scanner.nextInt();
                    toy.setFrequency(frequency);
                    System.out.println("Weight for the toy " + name + " successfully set!");
                });
    }
}
