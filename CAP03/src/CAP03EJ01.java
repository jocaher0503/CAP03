import java.util.Scanner;

public class CAP03EJ01 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.println("Este programa multiplica dos números");
        System.out.print("Por favor, introduzca el primer número: ");
        int x= sc.nextInt();
        System.out.print("Por favor, introduzca el segundo número: ");
        int y= sc.nextInt();
        System.out.println(x +"*"+ y +"="+(x*y));
        sc.close();
    }
}
