package T.Tools;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class conductDraws {
    public static void conductDraw(PriorityQueue<Toy> toyQueue) {
        try (FileWriter fileWriter = new FileWriter("draw_results.txt")) {
            for (int i = 0; i < 3; i++) {
                Toy drawnToy = toyQueue.poll();
                fileWriter.write("Congratulations! A toy fell out: " + drawnToy.getName() + "\n");
            }
            System.out.println("The drawing is over. The results are recorded in a file draw_results.txt");
        } catch (IOException e) {
            System.out.println("Error writing to the file");
            e.printStackTrace();
        }
    }

}