package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteEquals {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(22,11);
        Conta cc2 = new ContaCorrente(22,22);
        Conta cc3 = new ContaCorrente(22,22);

        lista.add(cc1);
        lista.add(cc2);

        System.out.println("Já existe? " + lista.contains(cc3));

        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}
