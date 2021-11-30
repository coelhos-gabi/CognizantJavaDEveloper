public class Quadrilatero {
// CONCEITO DE SOBRECARGA
    public static void area(double lado) {
        double area = lado * lado;
        System.out.println("A area do quadrado é: " + area);
    }
    public static void area(double lado1, double lado2) {
        double area = lado1 * lado2;
        System.out.println("A area do retângulo é: " + area);
    }
    public static void area(double baseMaior, double baseMenor, double altura) {
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A area do trapézio é: " + area);
    }
    public static void area(float diagonalMaior, float diagonalMenor) {
        double area = (diagonalMaior * diagonalMenor) / 2;
        System.out.println("A area do losango é: " + area);
    }
}
