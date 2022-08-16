package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaPoupanca;

public class TesteValores {

    public static void main(String[] args) {
        Conta conta = new ContaPoupanca(2486, 876543);
        conta.depositar(200.0);
        System.out.println(conta.getSaldo());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println(Conta.getTotalContas());
    }
}
