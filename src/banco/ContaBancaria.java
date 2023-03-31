public class ContaBancaria {
    String agencia;
    String numero;
    double saldo;

    public ContaBancaria(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
