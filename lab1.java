import java.util.*;
public class lab1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа работает только с целыми числами!!!");
        System.out.println("Введите параметры точки (X, Y)");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println("Введите параметры окружности (X, Y, r)");
        int Xc = sc.nextInt();
        int Yc = sc.nextInt();
        float Rc = sc.nextFloat();
        System.out.println("Введите параметры прямой (X1, Y1, X2, Y2)");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();
        System.out.println("Введите параметры прямоугольника (X3, Y3, X4, Y4)");
        int X3 = sc.nextInt();
        int Y3 = sc.nextInt();
        int X4 = sc.nextInt();
        int Y4 = sc.nextInt();
        sc.close();

        //Круг
        int xcDelta = (X - Xc);
        int ycDelta = (Y - Yc);
        double cDistance = Math.sqrt(Math.pow(xcDelta,2) + Math.pow(ycDelta,2));
        if (cDistance == Rc)
            System.out.println("Точка принадлежит окружности");
        if (cDistance > Rc)
            System.out.println("Точка за пределами окружности");
        if (cDistance < Rc)
            System.out.println("Точка внутри окружности");
        //Прямая
        if ((X1 == X2) || (Y1 ==Y2)) {
            if (X1 == X2)
                if (X > X1)
                    System.out.println("Точка над прямой");
                else System.out.println("Точка под прямой");
            if (Y1 == Y2)
                if (Y > Y1)
                    System.out.println("Точка правее прямой");
                else System.out.println("Точка левее прямой");
        }
        else {
            float Xp = (X - X1) / (X2 - X1);
            float Yp = (Y - Y1) / (Y2 - Y1);
            if (Xp == Yp)
                System.out.println("Точка принадлежит прямой");
            else if (Xp < Yp)
                System.out.println("Точка выше прямой");
            else System.out.println("Точка ниже прямой");
        }
        //Прямоугольник
        int Xmax = Math.max(X3, X4);
        int Xmin = Math.min(X3, X4);
        int Ymax = Math.max(Y3, Y4);
        int Ymin = Math.min(Y3, Y4);
        if (X > Xmax)
            System.out.println("Точка правее прямоугольника");
                else if (X < Xmin)
                    System.out.println("Точка левее прямоугольника");
        if (Y > Ymax)
            System.out.println("Точка над прямоугольником");
                else if (Y < Ymin)
                    System.out.println("Точка под прямоугольником");
        if ((X < Xmax) && (X > Xmin) && (Y < Ymax) && (Y > Ymin))
            System.out.println("Точка в прямоугольнике");
    }
}
