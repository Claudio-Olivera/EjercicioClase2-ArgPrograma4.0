import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero entero");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if(numero > 0){
            System.out.println("El numero "+numero+" es positivo");
        } else if (numero < 0) {
            System.out.println("El numero "+numero+" es negativo");
        }else{
            System.out.println("El numero es cero");
        }
    }
}
