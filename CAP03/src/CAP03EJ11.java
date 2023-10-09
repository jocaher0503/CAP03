import java.util.Scanner;

public class CAP03EJ11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca la cantidad de Kb: ");
        double Kb= sc.nextDouble();
        System.out.print(Kb+" Kb son "+ (Kb/1024)+ " Mb");
        sc.close();
    }
}
