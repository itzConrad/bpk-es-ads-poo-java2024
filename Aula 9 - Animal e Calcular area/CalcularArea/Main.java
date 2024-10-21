public class Main {
    public static void main(String[] args) {

        CalcularRetangula areaRetangulo = new CalcularRetangula(5, 10);
        CalcularCirculo areaCirculo = new CalcularCirculo(5);
        CalcularTriangulo areaTriangulo = new CalcularTriangulo(5, 10);
        areaRetangulo.calculo();
        areaCirculo.calcular();
        areaTriangulo.calcular();
    }
}
