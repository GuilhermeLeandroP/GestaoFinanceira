
public class Ganho {
    private String tipo;
    private String data;
    private Double valor;

    public Ganho(String tipo, String data, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Tipo: " + tipo + "\nData: " + data + "\nValor: R$ " + String.format("%.2f", valor) ;
    }
}