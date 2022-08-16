package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.ContaCorrente;

public class TesteSacar {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(7531, 657159);

        conta.depositar(200.0);
        try {
            conta.sacar(210.0);
        } catch (Exception exception){
            System.out.println("Exception: " + exception.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
