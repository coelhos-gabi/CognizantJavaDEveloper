import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;
        float media;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if (numero > maior){
                maior = numero;
            }
            soma += numero;
            count ++;
        } while (count < 5);

        media = soma/count;
        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media);
    }
}
