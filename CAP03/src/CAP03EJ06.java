import java.util.Scanner;

public class CAP03EJ06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la base (cm): ");
        double base =sc.nextDouble();
        System.out.print("Por favor, introduzca la longitud de la altura (cm): ");
        double altura =sc.nextDouble();
        System.out.printf("El área del rectángulo es %.1f cm2", (base*altura/2));
        sc.close();
    }
}
