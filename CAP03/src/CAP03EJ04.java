import java.util.Scanner;

public class CAP03EJ04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Por favor, introduzca el primer número: ");
        double a =sc.nextDouble();
        System.out.print("Por favor, introduzca el segundo número: ");
        double b =sc.nextDouble();
        System.out.printf("a= %.1f%n", a);
        System.out.printf("b= %.1f%n", b);
        System.out.printf("a+b= %.1f%n", a+b);
        System.out.printf("a-b= %.1f%n", a-b);
        System.out.printf("a*b= %.1f%n", a*b);
        System.out.printf("a/b= %f%n", a/b);
        sc.close();
    }
}
