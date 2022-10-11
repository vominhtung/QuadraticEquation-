import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();;

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double d = quadraticEquation.getDiscriminant();
        if (d > 0){
            double r1 = quadraticEquation.getRoot1();
            double r2 = quadraticEquation.getRoot2();
            System.out.print("The equation has 2 roots: \" + r1 + \" and \" + r2);");
        }else if (d == 0){
            double r1 = quadraticEquation.getRoot1();
            System.out.print("The equation has 1 root: " + r1);
        }
        else
            System.out.print("The equation has no real roots");
        }
    }
