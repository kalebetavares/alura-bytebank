package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaPoupanca;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta conta1 = new ContaPoupanca(3571, 426957) {
        };
        conta1.depositar(300.0);

        System.out.println("Saldo da conta1: " + conta1.getSaldo());

        Conta conta2 = conta1;
        System.out.println("Saldo da conta2: " + conta2.getSaldo());

        conta2.depositar(100);
        System.out.println("Saldo da conta2: " + conta2.getSaldo());

        System.out.println("Saldo da conta1: " + conta1.getSaldo());

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
