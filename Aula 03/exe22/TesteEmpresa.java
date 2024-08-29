package Exercicio22;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Biopark", "99 999 999/9999-99", 55);
        System.out.println(empresa.toString());
        empresa.contratar();
        empresa.demitir();
    }
}
