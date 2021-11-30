import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contaPar = 0;
        int contaImpar = 0;
        int numero;
        int quantNumeros;
        int count = 0;

        System.out.println("Insira a quantidade de numeros");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Numero:");
            numero = scan.nextInt();
            if (numero%2 == 0) contaPar ++;
            else contaImpar++;
            count ++;
        } while (count < quantNumeros);
        System.out.println("Numeros pares: " + contaPar);
        System.out.println("Numeros impares: " + contaImpar);
    }
}
