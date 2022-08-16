package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;
import br.com.bytebank.bank.model.SaldoInsuficienteException;

public class TesteSaqueNegativo {

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(6542, 753951);
        conta.depositar(100.0);
        conta.sacar(200.0);

        System.out.println(conta.getSaldo());
    }
}
