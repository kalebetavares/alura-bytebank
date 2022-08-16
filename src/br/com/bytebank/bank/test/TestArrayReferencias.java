package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.Conta;
import br.com.bytebank.bank.model.ContaCorrente;
import br.com.bytebank.bank.model.ContaPoupanca;

public class TestArrayReferencias {

    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(1122,753957);
        ContaCorrente contaCorrente2 = new ContaCorrente(1122,753959);
        ContaCorrente contaCorrente3 = new ContaCorrente(1122,753952);
        ContaCorrente contaCorrente4 = new ContaCorrente(1122,553951);
        ContaCorrente contaCorrente5 = new ContaCorrente(1122,653951);

        ContaCorrente[] contas = {contaCorrente1, contaCorrente2, contaCorrente3, contaCorrente4, contaCorrente5};

        for (ContaCorrente conta: contas) {
            System.out.println(conta.getNumero());
        }

        Object[] objects = new Object[5];

        ContaPoupanca contaPoupanca1 = new ContaPoupanca(5544,652125);

        objects[0] = contaCorrente1;
        objects[1] = contaPoupanca1;


        for (Object object: objects) {
            System.out.println(object);
        }

        ContaPoupanca ref = (ContaPoupanca) objects[1];
        System.out.println(ref);

        Cliente cliente = new Cliente();
        objects[2] = cliente;

        System.out.println(objects[2]);
    }
}
