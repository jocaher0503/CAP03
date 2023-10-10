import java.util.Scanner;

public class CAP03EJ12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca la nota del primer examen: ");
        double nota1= sc.nextDouble();
        System.out.print("¿Qué nota quiere sacar en el trimestre? ");
        double notaFinal = sc.nextDouble();
        double nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
        System.out.print("Para tener un " + notaFinal + " en el trimestre");
        System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");  
        sc.close();
    }
}
