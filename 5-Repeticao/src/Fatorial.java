import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 1;
        int produto = 1;

        System.out.println("Digite um numero");
        numero = scan.nextInt();
        for (int i = numero; i >= 1; i--){
            produto *= i;
        }
        System.out.println(numero + "!= " + produto);
    }
}
