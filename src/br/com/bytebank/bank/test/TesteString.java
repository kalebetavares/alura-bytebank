package br.com.bytebank.bank.test;

import java.io.PrintStream;
import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura";

        //String outra = nome.replace("Al", "AL");
        //String outra = nome.toUpperCase();
        //char outra = nome.charAt(2);
        //int outra = nome.indexOf("ur");
        //String outra = nome.substring(1);
        /*int outra = nome.length();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }*/
        String vazio = "     Alura       ";
        String outroVazio = vazio.trim();

        //System.out.println(outroVazio.isEmpty());
        //System.out.println(outroVazio);
        System.out.println(vazio.contains("Alura"));

        System.out.println(nome);
        //System.out.println(outra);


    }
}
