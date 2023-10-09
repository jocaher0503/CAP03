import java.util.Scanner;

public class CAP03EJ08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Por favor, introduzca la cantidad de horas semanales que trabaja: ");
        int horas= sc.nextInt();
        System.out.print("Su salario semanal es de: "+(horas*12)+" euros");
        sc.close();
    }
}
