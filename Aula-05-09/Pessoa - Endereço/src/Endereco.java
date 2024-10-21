public class Endereco {
    private String logradouro;
    private String Rua;
    private String cep;
    private String estado;

    public Endereco (String logradouro, String Rua, String cep, String estado){
        this.logradouro = logradouro;
        this.Rua = Rua;
        this.cep = cep;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getRua() {
        return Rua;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", Rua='" + Rua + '\'' +
                ", cep='" + cep + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
