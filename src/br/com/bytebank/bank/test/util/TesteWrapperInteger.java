package br.com.bytebank.bank.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        Integer idade = 29;
        System.out.println(idade);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(idade);

        String s = args[0];
        Integer valor = Integer.parseInt(s);
        System.out.println(valor);


    }
}
