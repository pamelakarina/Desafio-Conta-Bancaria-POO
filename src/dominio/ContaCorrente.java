package dominio;

public class ContaCorrente  extends Conta{
    public String extrato(){
        double extrato = super.getSaldo();
        return "O extrato bancario da conta corrente é " + extrato;
    }
}
