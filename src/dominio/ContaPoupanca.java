package dominio;

public class ContaPoupanca extends Conta {

    public String extrato (){
        double extrato = super.getSaldo();
        return "O extrato da Conta Poupanca é " + extrato;
    }
}
