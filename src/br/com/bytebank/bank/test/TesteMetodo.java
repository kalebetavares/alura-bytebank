package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;
import br.com.bytebank.bank.model.ContaPoupanca;
import br.com.bytebank.bank.model.SaldoInsuficienteException;

public class TesteMetodo {

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(9876, 356875);
        conta.depositar(100.0);

        System.out.println("Saldo da conta:" + conta.getSaldo());

        conta.sacar(50.0);
        System.out.println("Saldo da conta: " + conta.getSaldo());

        Conta contaDaMarcela = new ContaPoupanca(4287, 654852);
        contaDaMarcela.depositar(1000.0);
        contaDaMarcela.transferir(300.0, conta);

        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(conta.getSaldo());

        System.out.println(conta.getTitular());
    }
}
