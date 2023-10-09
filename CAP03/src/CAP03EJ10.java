import java.util.Scanner;

public class CAP03EJ10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca la cantidad de Mb: ");
        double Mb= sc.nextDouble();
        System.out.print(Mb+" Mb son "+ (Mb*1024)+ " Kb");
        sc.close();
    }
}