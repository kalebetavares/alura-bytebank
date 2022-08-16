package br.com.bytebank.bank.test.io;

import br.com.bytebank.bank.model.Cliente;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteDesserializacaoCliente {

    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        System.out.println(cliente);
        ois.close();
    }
}
