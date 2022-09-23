/*
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e 
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios
 */
package Exercicio2;

public class App {
    

    public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(1,"Andreia Matias"); 
        System.out.println("Número da Conta: " + cc.getNumeroConta());
        System.out.println("Nome do correntista: " + cc.getNomeCorrentista());
        System.out.println("Saldo: " + cc.getSaldoConta());
        
        cc.alterarNome("Andreia da Conceicação Matias");
        System.out.println("Nome do correntista: " + cc.getNomeCorrentista());
        cc.depositar(1000);
        System.out.println("Saldo: " + cc.getSaldoConta());
        cc.sacar(500);
        System.out.println("Saldo: " + cc.getSaldoConta());
        cc.sacar(2000);
    
    }
}
