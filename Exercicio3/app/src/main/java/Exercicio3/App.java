/*
 Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os 
seguintes atributos: tipo de combust�vel, valor por litro e quantidade de combust�vel. Al�m desses 
atributos a classes deve conter os seguintes m�todos.
a. abastecerPorValor; //m�todo onde � informado o valor a ser abastecido e mostra a quantidade de 
litros que foi colocada no ve�culo
b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de combust�vel e mostra o 
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combust�vel.
d. alterarCombustivel; //altera o tipo do combust�vel.
e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba.
Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel
 */
package Exercicio3;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        BombaCombustivel bc = new BombaCombustivel();
        System.out.println("Informe a quantidade de combust�vel dispon�vel na bomba:");
        bc.alterarQuantidadeCombustivel(300);
        System.out.println("Informe o tipo de combustivel: ");
        bc.alterarCombustivel(leitor.next());
        System.out.println("Informe o valor do combustivel: ");
        bc.alterarValor(leitor.nextDouble());
        
       
        System.out.printf("Abastecer R$50,00: %s litros.",bc.abastecerPorValor(50));
        System.out.println("");
        System.out.printf("Quantidade de combust�vel na bomba: %s", bc.getQtdeCombustivel());
        System.out.println("");
        System.out.printf("Abastecer 10 litros: %s litros.",bc.abastecerPorLitro(10));
        System.out.println("");
        System.out.printf("Quantidade de combust�vel na bomba: %s", bc.getQtdeCombustivel());
    }
}
