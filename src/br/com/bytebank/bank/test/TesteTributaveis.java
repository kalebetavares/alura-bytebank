package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.CalculadorDeImposto;
import br.com.bytebank.bank.model.ContaCorrente;
import br.com.bytebank.bank.model.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(7539, 951321);
        contaCorrente.depositar(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registrar(contaCorrente);
        calculadorDeImposto.registrar(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
