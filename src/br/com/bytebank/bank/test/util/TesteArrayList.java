package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;
import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());


        Conta cc3 = new ContaCorrente(33, 311);
        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc3);
        lista.add(cc4);

        for (Object elemento: lista) {
            System.out.println(elemento);
        }

    }
}
