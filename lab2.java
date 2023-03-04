import java.io.*;
import java.util.Scanner;

public class lab2 {
    private static Line line;
    private static Rectangle rectangle;
    private static Circle circle;
    public static void main(String[] args) {
        // Get data
        ReadFile("figures.txt");
        Scanner scanner = new Scanner(System.in);
        // Main
        boolean num = true;
        while (num) {
            System.out.println("Select figure (1 - Line, 2 - Rectangle, 3 - Circle, 0 - Quit):");
            int selector = scanner.nextInt();
            switch (selector) {
                case 1:
                    // Move line
                    Scanner scanner1 = new Scanner(System.in);
                    boolean num1 = true;
                    while (num1) {
                        System.out.println("Position is: " + line);
                        System.out.println("Enter direction (w - up, a - left, s - down, d - right, q - quit):");
                        String dir = scanner1.nextLine();
                        num1 = shift(selector, dir);
                    }
                    break;
                case 2:
                    // Move rectangle
                    Scanner scanner2 = new Scanner(System.in);
                    boolean num2 = true;
                    while (num2) {
                        System.out.println("Position is: " + rectangle);
                        System.out.println("Enter direction (w - up, a - left, s - down, d - right, q - quit):");
                        String dir = scanner2.nextLine();
                        num2 = shift(selector, dir);
                    }
                    break;
                case 3:
                    // Move circle
                    Scanner scanner3 = new Scanner(System.in);
                    boolean num3 = true;
                    while (num3) {
                        System.out.println("Position is: " + circle);
                        System.out.println("Enter direction (w - up, a - left, s - down, d - right, q - quit):");
                        String dir = scanner3.nextLine();
                        num3 = shift(selector, dir);
                    }
                    break;
                case 0:
                    num = false;
                    break;
                default:
                    System.out.println("No such figure!");
            }
        }
    }
    private static class Line{
        private int x1, y1, x2, y2;
        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        public void moveUp() {
            y1++;
            y2++;
        }
        public void moveLeft() {
            x1--;
            x2--;
        }
        public void moveDown() {
            y1--;
            y2--;
        }
        public void moveRight() {
            x1++;
            x2++;
        }
        @Override
        public String toString() {
            return "A("+x1+";"+y1+");B("+x2+";"+y2+")";
        }
    }
    private static class Rectangle{
        private int x1, y1, x2, y2;
        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        public void moveUp() {
            y1++;
            y2++;
        }
        public void moveLeft() {
            x1--;
            x2--;
        }
        public void moveDown() {
            y1--;
            y2--;
        }
        public void moveRight() {
            x1++;
            x2++;
        }
        @Override
        public String toString() {
            return "A("+x1+";"+y1+");B("+x2+";"+y2+")";
        }
    }
    private static class Circle{
        private int x1, y1, r;
        public Circle(int x1, int y1, int r) {
            this.x1 = x1;
            this.y1 = y1;
            this.r = r;
        }
        public void moveUp() {
            y1++;
        }
        public void moveLeft() {
            x1--;
        }
        public void moveDown() {
            y1--;
        }
        public void moveRight() {
            x1++;
        }
        @Override
        public String toString() {
            return "center("+x1+";"+y1+");radius:"+r+";";
        }
    }
    private static void ReadFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));

            String[] lineCoords = scanner.nextLine().split(",");
            line = new Line(Integer.parseInt(lineCoords[0]),
                    Integer.parseInt(lineCoords[1]),
                    Integer.parseInt(lineCoords[2]),
                    Integer.parseInt(lineCoords[3]));

            String[] rectangleCoords = scanner.nextLine().split(",");
            rectangle = new Rectangle(  Integer.parseInt(rectangleCoords[0]),
                    Integer.parseInt(rectangleCoords[1]),
                    Integer.parseInt(rectangleCoords[2]),
                    Integer.parseInt(rectangleCoords[3]));

            String[] circleCoords = scanner.nextLine().split(",");
            circle = new Circle(Integer.parseInt(circleCoords[0]),
                    Integer.parseInt(circleCoords[1]),
                    Integer.parseInt(circleCoords[2]));
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }
    private static boolean shift(int figure, String dir){
        if (figure == 1)
        {
            switch (dir) {
                case "w":
                    line.moveUp();
                    break;
                case "a":
                    line.moveLeft();
                    break;
                case "s":
                    line.moveDown();
                    break;
                case "d":
                    line.moveRight();
                    break;
                case "q":
                    return false;
                default:
                    System.out.println("No such direction.");
                    break;
            }
        }
        if (figure == 2)
        {
            switch (dir) {
                case "w":
                    rectangle.moveUp();
                    break;
                case "a":
                    rectangle.moveLeft();
                    break;
                case "s":
                    rectangle.moveDown();
                    break;
                case "d":
                    rectangle.moveRight();
                    break;
                case "q":
                    return false;
                default:
                    System.out.println("No such direction.");
                    break;
            }
        }
        if (figure == 3)
        {
            switch (dir) {
                case "w":
                    circle.moveUp();
                    break;
                case "a":
                    circle.moveLeft();
                    break;
                case "s":
                    circle.moveDown();
                    break;
                case "d":
                    circle.moveRight();
                    break;
                case "q":
                    return false;
                default:
                    System.out.println("No such direction.");
                    break;
            }
        }
        return true;
    }
}