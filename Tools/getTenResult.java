package T.Tools;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class getTenResult {
    public static void getTenResults(PriorityQueue<Toy> toyQueue) {
        try (FileWriter fileWriter = new FileWriter("poll_results.txt")) {
            for (int i = 0; i < 10; i++) {
                Toy polledToy = toyQueue.poll();
                fileWriter.write("A toy has been received: " + polledToy.getName() + "\n");
            }
            System.out.println("The poll() method was called 10 times. The results are recorded in a file poll_results.txt");
        } catch (IOException e) {
            System.out.println("Error writing to the file");
            e.printStackTrace();
        }
    }
}
