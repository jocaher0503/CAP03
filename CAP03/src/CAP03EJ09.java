import java.util.Scanner;

public class CAP03EJ09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca la longitud de la altura del cono (cm): ");
        double altura=sc.nextDouble();
        System.out.print("Introduzca el radio del cono (cm): ");
        double radio=sc.nextDouble();
        System.out.println("El volumen del cono es: "+ ((3.14*radio*radio*altura)/3));
        sc.close();
    }
}
