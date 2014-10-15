import java.util.Scanner;

public class Calculator {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number 1");
        int n1 = keyboard.nextInt();
        System.out.println("Enter number 2");
        int n2 = keyboard.nextInt();

        Calculator calc = new Calculator();

        System.out.println("Running methods...");

        System.out.println(calc.add(n1, n2));
        System.out.println(calc.subtract(n1, n2));
        System.out.println(calc.multiply(n1, n2));
        System.out.println(calc.modulus(n1, n2));
        System.out.println(calc.divide(n1, n2));
    }

    public int add(int a, int b)
    {
        System.out.println("Add");
        return a + b;
    }

    public int subtract(int a, int b)
    {
        System.out.println("Subtract");
        return a-b;
    }

    public int multiply(int a, int b)
    {
        System.out.println("Multiply");
        return a*b;
    }

    public double modulus(int a, int b)
    {
        System.out.println("Modulus");
        double d = (double) a;
        double db = (double) b;

        return d%db;
    }

    public double divide(int a, int b)
    {
        System.out.println("Divide");
        double d = (double) a;
        double db = (double) b;

        return d/db;
    }
}