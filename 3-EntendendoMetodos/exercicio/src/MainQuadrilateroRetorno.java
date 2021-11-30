public class MainQuadrilateroRetorno {

    public static void main(String[] args){
        System.out.println("**** Utilizando retorno para area ****");

        double areaQuadrado = QuadrilateroRetorno.area(3);
        System.out.println("A area do quadrado é: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(5d,4d);
        System.out.println("A area do quadrado é: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(10, 4, 7);
        System.out.println("A area do quadrado é: " + areaTrapezio);

        double areaLosango = QuadrilateroRetorno.area(5f, 5f);
        System.out.println("A area do quadrado é: " + areaLosango);
    }
}
