
public class Gasto {
    private String tipo;
    private String data;
    private double valor;
    private String formaPagamento;

    public Gasto(String tipo, String data, double valor, String formaPagamento) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public String toString() {
        return "Tipo: " + tipo + "\nData: " + data + "\nValor: R$ " + String.format("%.2f", valor) + "\nForma de pagamento: " + formaPagamento;
    }
}
