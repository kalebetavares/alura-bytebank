package br.com.bytebank.bank.model;

public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
