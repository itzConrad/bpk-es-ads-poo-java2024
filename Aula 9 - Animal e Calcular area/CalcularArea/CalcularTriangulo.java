public class CalcularTriangulo {
    private double area;
    private double base;
    private double altura;

    public CalcularTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcular (){
        area = (base * altura) / 2 ;
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "CalcularTriangulo{" +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
