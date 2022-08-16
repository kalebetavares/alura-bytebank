package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.ContaCorrente;
import br.com.bytebank.bank.model.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {
        System.out.println("x");
        System.out.println(3);
        System.out.println(false);


        ContaCorrente contaCorrente = new ContaCorrente(22,33);
        ContaPoupanca contaPoupanca = new ContaPoupanca(22,34);
        Cliente cliente = new Cliente();

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
        //println(cliente);
    }

    static void println(){}
    static void println(int x) {}
    static void println(boolean x){}
    static void println(Object x){}
}
