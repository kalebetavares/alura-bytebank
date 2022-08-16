package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {
        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc1 = new ContaCorrente(11,22);
        Conta cc2 = new ContaCorrente(22,33);
        Conta cc3 = new ContaCorrente(33, 44);

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);

        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}
