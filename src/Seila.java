import java.util.Scanner;

public class Seila {
    public static void main(String[] args) {
       boolean continuar = true;
        Scanner teclado = new Scanner(System.in);
        do {
        try {
            int numerador = 0;
            System.out.println("Digite o numerador: ");
            numerador = teclado.nextInt();
            System.out.println("Digite o denominador: ");
            int denominador = teclado.nextInt();
            int result = numerador / denominador;
            System.out.println("Resultado= " + result);
            continuar = false;
        }
        catch (Exception ex){

            System.out.println("Seila");
            teclado.nextLine();
        }
        }while (continuar);
    }
}
