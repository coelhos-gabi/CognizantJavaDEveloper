
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float nota;

        System.out.println("Insira a nota: ");
        nota = scan.nextFloat();

        while (nota < 0 || nota > 10) {
            System.out.println("Informe um valor válido:");
            nota = scan.nextFloat();
        }
    }
}
