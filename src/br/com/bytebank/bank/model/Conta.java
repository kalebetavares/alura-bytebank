package br.com.bytebank.bank.model;

import java.util.Objects;

/**
 * Classe representa o molde para criacao de uma conta bancaria.
 *
 * @author Kalebe Tavares
 */

public abstract class Conta implements Comparable<Conta>, java.io.Serializable {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   private static int totalContas;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     *
     * @param agencia
     * @param numero
     */

   public Conta(int agencia, int numero){
       Conta.totalContas++;
       //System.out.println("O total de contas é: " + Conta.TOTAL_CONTAS);

       if(agencia <= 0 && numero <= 0){
           System.out.println("Erro! Somente números maiores que zero.");
           return;
       }
       this.agencia = agencia;
       this.numero = numero;
       //System.out.println("Conta criada!" + "\nAgencia: " + this.agencia + "\nNumero da conta: " + this.numero);
   }

    public void depositar(double valor){
        if(valor > 0) {
            this.saldo += valor;
        }else {
            System.out.println("Valor inválido, tente novamente.");
        }
    }

    /**
     * Valor precisa ser maior do que o saldo na Conta.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
            this.sacar(valor);
            destino.depositar(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalContas(){
       return Conta.totalContas;
    }

    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.saldo, conta.saldo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta conta)) return false;
        return this.agencia == conta.agencia && this.numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.agencia, this.numero);
    }

    @Override
    public String toString() {
        return "{" +
                "saldo=" + this.saldo +
                ", agencia=" + this.agencia +
                ", numero=" + this.numero +
                ", titular=" + this.titular +
                '}';
    }
}
