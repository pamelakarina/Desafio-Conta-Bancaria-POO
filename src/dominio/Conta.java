package dominio;

public class Conta {
    protected Cliente cliente;
    private int numero;
    private double saldo;

    public Cliente getCliente() {
        return cliente;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        saldo = saldo - valor; 
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void transferencia(Conta conta,  double valor){
        saldo = saldo - valor; 
        conta.depositar(valor);
    }

    
}
