/*
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
n�mero da conta, nome do correntista e saldo. Os m�todos s�o os seguintes: alterarNome, dep�sito e 
saque; No construtor, saldo � opcional, com valor default zero e os demais atributos s�o obrigat�rios
 */
package Exercicio2;

public class App {
    

    public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(1,"Andreia Matias"); 
        System.out.println("N�mero da Conta: " + cc.getNumeroConta());
        System.out.println("Nome do correntista: " + cc.getNomeCorrentista());
        System.out.println("Saldo: " + cc.getSaldoConta());
        
        cc.alterarNome("Andreia da Conceica��o Matias");
        System.out.println("Nome do correntista: " + cc.getNomeCorrentista());
        cc.depositar(1000);
        System.out.println("Saldo: " + cc.getSaldoConta());
        cc.sacar(500);
        System.out.println("Saldo: " + cc.getSaldoConta());
        cc.sacar(2000);
    
    }
}
