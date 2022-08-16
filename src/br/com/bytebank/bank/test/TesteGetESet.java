package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaPoupanca;

public class TesteGetESet {

    public static void main(String[] args) {
        Conta conta = new ContaPoupanca(1337, 224466);

        System.out.println(conta.getNumero());

        Cliente kalebe = new Cliente();
        //conta.titular = paulo;
        kalebe.setNome("Kalebe Tavares");

        conta.setTitular(kalebe);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        // agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(kalebe);
        System.out.println(conta.getTitular());
    }
}
