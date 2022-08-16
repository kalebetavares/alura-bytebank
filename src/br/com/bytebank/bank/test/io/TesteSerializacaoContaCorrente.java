package br.com.bytebank.bank.test.io;

import br.com.bytebank.bank.model.Cliente;
import br.com.bytebank.bank.model.ContaCorrente;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoContaCorrente {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("452.741.335-42");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.setTitular(cliente);
        cc.depositar(222.3);


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
