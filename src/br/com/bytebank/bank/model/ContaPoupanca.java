package br.com.bytebank.bank.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public String toString() {
        return "ContaPoupanca" + super.toString();
    }
}
