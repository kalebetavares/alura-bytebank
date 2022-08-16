package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.ContaCorrente;

public class TesteBanco {

    public static void main(String[] args) {
        Cliente kalebe = new Cliente();
        kalebe.setNome("Kalebe Tavares");
        kalebe.setCpf("987.654.32-10");
        kalebe.setProfissao("Programador");

        ContaCorrente contaCorrente = new ContaCorrente(8462, 123456);
        contaCorrente.depositar(100.0);

        contaCorrente.setTitular(kalebe);

        System.out.println("Nome: " + contaCorrente.getTitular().getNome() + "\nCPF:" + contaCorrente.getTitular().getCpf());

        //Teste deposito negativo
        contaCorrente.depositar(-50);
    }
}
