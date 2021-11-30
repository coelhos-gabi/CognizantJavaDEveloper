import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero;
        int count = 0;
        int produto;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual tabuada deseja?");
        numero = scan.nextInt();

        do {
            produto = numero * count;
            System.out.println(numero + " x " + count + " = " + produto);
            count++;
        } while(count <= 10);
    }
}
