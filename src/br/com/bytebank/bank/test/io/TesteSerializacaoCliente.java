package br.com.bytebank.bank.test.io;

import br.com.bytebank.bank.model.Cliente;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("452.741.335-42");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();
    }
}
