import java.util.Scanner;

public class CAP03EJ07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Por favor, introduzca la base imponible (objeto sin IVA): ");
        double BaseImp= sc.nextDouble();
        System.out.printf("IVA (21%%): %.2f euros\n", (BaseImp * 0.21));
        System.out.printf("Total: %.2f euros", (BaseImp * 1.21));
        sc.close();
    }
}
