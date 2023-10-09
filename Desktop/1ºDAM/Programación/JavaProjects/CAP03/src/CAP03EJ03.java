import java.util.Scanner;

public class CAP03EJ03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
        int pesetas=sc.nextInt();
        System.out.printf( "%d pesetas son %.2f", pesetas, pesetas/166.386);
        sc.close();
    }
}
