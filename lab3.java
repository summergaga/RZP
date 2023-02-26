import java.util.Scanner;
import java.util.Random;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of iterations: ");
        double numPoints = scanner.nextDouble();
        double numPointsInsideCircle = 0;
        Random rand = new Random();
        //Алгоритм работы для единичной окружности
        for (double i = 0; i < numPoints; i++) {
            double x = rand.nextDouble() * 2 - 1;
            double y = rand.nextDouble() * 2 - 1;

            if (x*x + y*y <= 1) {
                numPointsInsideCircle++;
            }
        }
        double pi = 4.0 * numPointsInsideCircle / numPoints;
        System.out.println("Estimated value of pi: " + pi);
        System.out.println("     Java value of pi: " + Math.PI);
    }
}