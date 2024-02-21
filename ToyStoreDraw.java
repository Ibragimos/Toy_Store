package T;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

import T.Tools.NewToy;
import T.Tools.Toy;
import T.Tools.ToyFrequency;
import T.Tools.conductDraws;
import T.Tools.getTenResult;

public class ToyStoreDraw {

    private static PriorityQueue<Toy> toyQueue = new PriorityQueue<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the toy store!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new toy");
            System.out.println("2. Set the weight for the toy to fall out");
            System.out.println("3. To hold a drawing");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    NewToy.addNewToy(toyQueue, scanner);
                    break;
                case 2:
                    ToyFrequency.setToyFrequency(toyQueue, scanner);
                    break;
                case 3:
                    conductDraws.conductDraw(toyQueue);
                    getTenResult.getTenResults(toyQueue); 
                    break;
                case 4:
                    System.out.println("Thanks for playing! See you soon.");
                    return;
                default:
                    System.out.println("Wrong choice. Please try again.");
            }
        }
    }

    
}
