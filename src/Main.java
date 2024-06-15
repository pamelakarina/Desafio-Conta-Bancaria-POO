import dominio.Cliente;
import dominio.ContaCorrente;
import dominio.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente Pamela = new Cliente();
        Pamela.setNome("Pamela");

        Cliente Gabriel = new Cliente();
        Gabriel.setNome("Gabriel");

        ContaCorrente ccPamela = new ContaCorrente();
        ccPamela.setCliente(Pamela);
        ccPamela.setNumero(1234);
        ccPamela.setSaldo(8000);

        ContaPoupanca cpGabriel = new ContaPoupanca();
        cpGabriel.setCliente(Gabriel);
        cpGabriel.setNumero(5678);
        cpGabriel.setSaldo(5000.50);
        cpGabriel.sacar(100.50);
        cpGabriel.transferencia(ccPamela, 1.50);
        System.out.println(cpGabriel.extrato());
        ccPamela.depositar(100);
        ccPamela.transferencia(cpGabriel,4000);
        System.out.println(ccPamela.extrato());

    }
}
