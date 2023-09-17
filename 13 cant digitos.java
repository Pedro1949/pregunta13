import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero?: ");
        int numero = scanner.nextInt();

        int digitos;

        if (numero < 0) {
            numero = -numero;
            digitos = (int) (Math.log10(numero) + 1);
        } else if (numero == 0) {
            digitos = 1;
        } else {
            digitos = (int) (Math.log10(numero) + 1);
        }

        System.out.println("Cantidad de digitos: " + digitos );
    }
}
