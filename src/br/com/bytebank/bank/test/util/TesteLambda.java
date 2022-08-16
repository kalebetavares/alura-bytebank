package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {

    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaCorrente(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaCorrente(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta: lista) {
            System.out.println(conta);
        }

        System.out.println("------------------");

        lista.sort((o1, o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));

        lista.sort((o1, o2) -> o1.getTitular().getNome().compareTo(o2.getTitular().getNome()));

        lista.forEach(conta -> {System.out.println(conta);});
    }
}
