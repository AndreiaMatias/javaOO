/*
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e 
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios 
*/
package Exercicio2;

/**
 *
 * @author deiam
 */
public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldoConta;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldoConta) {
        this.setNumeroConta(numeroConta);
        this.setNomeCorrentista(nomeCorrentista);
        this.setSaldoConta(saldoConta);
    }
    
    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.setNumeroConta(numeroConta);
        this.setNomeCorrentista(nomeCorrentista);
        this.setSaldoConta(0);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    public String alterarNome(String nomeAlterado){
        this.setNomeCorrentista(nomeAlterado);
        return "Nome alterado com sucesso";
    }
    
    public void depositar(double valorDeposito){
        this.setSaldoConta(this.saldoConta + valorDeposito);
        System.out.println("Depósito realizado com sucesso. O saldo atual é de " + this.saldoConta);
    }
    
    public void sacar (double valorSaque){
        if (valorSaque > this.getSaldoConta()){
            System.out.println("Saldo insuficiente.");
        }else{
            this.setSaldoConta(this.saldoConta - valorSaque);
            System.out.println("Saque realizado com sucesso. O saldo atual é de " + this.saldoConta);
        }
        
    }
}
