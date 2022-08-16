package br.com.bytebank.bank.model;


public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente contaCorrente = new ContaCorrente(8524, 753951);
        contaCorrente.depositar(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(9512, 7951354);
        contaPoupanca.depositar(200.0);

        contaCorrente.transferir(10.0, contaPoupanca);


        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
