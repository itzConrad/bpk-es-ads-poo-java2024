public class CalcularCirculo {
    private double area;
    private double  raio;
    private double pi = 3.14;

    public CalcularCirculo(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public double getPi() {
        return pi;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calcular (){
        area = pi * (raio * raio);
        System.out.println(area);
    }

    @Override
    public String toString() {
        return "CalcularCirculo{" +
                ", raio=" + raio +
                '}';
    }
}
