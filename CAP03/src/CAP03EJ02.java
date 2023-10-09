import java.util.Scanner;

public class CAP03EJ02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor, introduzca la cantidad de euros que quiere convertir");
        Double euros=sc.nextDouble();
        System.out.printf("%.2f euros son %d pesetas", euros, (int)Math.round(euros*166.386));
        sc.close();
    }
}
