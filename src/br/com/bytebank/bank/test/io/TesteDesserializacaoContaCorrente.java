package br.com.bytebank.bank.test.io;

import br.com.bytebank.bank.model.ContaCorrente;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TesteDesserializacaoContaCorrente {
    public static void main(String[] args) throws Exception{

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        System.out.println(cc);
        ois.close();
    }
}
