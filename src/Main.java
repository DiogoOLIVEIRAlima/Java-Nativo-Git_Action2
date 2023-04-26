import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String frase = "Blablabla";
//        String NovaFrase;
//        try {
//            NovaFrase = frase.toUpperCase();
//       }catch(NullPointerException ex){
//           System.out.println("Não pode ser nulo");
//           frase= "tratamento";
//           NovaFrase = frase.toUpperCase();
//       }
//        System.out.println("Frase antiga: " + frase);
//        System.out.println("Frase nova: " + NovaFrase);

//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o CPF somente com números");
//        String cpf = teclado.nextLine();
//        try{
//            long numCPF = Long.parseLong(cpf);
//            System.out.println("Formato correto");
//        }
//        catch(NumberFormatException ex){
//            System.out.println("Cpf digitado incorretamente");
//        }
//
//        Scanner teclado = new Scanner(System.in);
//        int numerador = 0;
//        System.out.println("Digite o numerador: ");
//        numerador = teclado.nextInt();
//        System.out.println("Digite o denominador: ");
//        int denominador = teclado.nextInt();
//        int result = numerador / denominador;
//        System.out.println("Resultado= " + result);
//
//        String frase = "Blablabla";
//        String novaFrase;
//        try {
//            novaFrase = frase.toUpperCase();
//        }catch (NumberFormatException ex){
//            return;
//        }finally {
//            System.out.println("O método transforma FraseParaMaiscula foi executado");
//        }

    }

    public void media(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 números para fazer sua média: ");
        String numeroLido = teclado.nextLine();
        double soma = 0;
        double numero;
        for(int i = numeroLido.length() - 1; i > 0; i--){
            try {
                numero = Double.valueOf(String.valueOf(numeroLido.charAt(i)));
                soma += numero;
            }
            catch (Exception ex) {

            }
        }
        double media = soma / numeroLido.length();
        int verificador = (int) Math.round(media);
        System.out.println("A média dos numeros lidos é: " + media + "- e o digito verificador é: " + verificador);
    }
}