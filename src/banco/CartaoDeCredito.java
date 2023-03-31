public class CartaoDeCredito {
    String numero;
    double limite;

    public CartaoDeCredito(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getLimite() {
        return this.limite;
    }
}
