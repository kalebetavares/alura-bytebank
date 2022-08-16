package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaPoupanca;

public class TesteContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaMarcela = new ContaPoupanca(1389, 997755);
        System.out.println("Saldo: " + contaDaMarcela.getSaldo());

        contaDaMarcela.setTitular(new Cliente());
        System.out.println(contaDaMarcela.getTitular());

        contaDaMarcela.getTitular().setNome("Marcela");

        System.out.println(contaDaMarcela.getTitular().getCpf());
        System.out.println(contaDaMarcela);
    }
}
