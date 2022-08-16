package br.com.bytebank.bank.model;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        super.sacar(valor);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.15;
    }

    @Override
    public String toString() {
        return "ContaCorrente" + super.toString();
    }
}
