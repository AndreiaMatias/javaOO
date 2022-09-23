/*
 Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os 
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses 
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de 
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o 
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível
 */
package Exercicio3;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        BombaCombustivel bc = new BombaCombustivel();
        System.out.println("Informe a quantidade de combustível disponível na bomba:");
        bc.alterarQuantidadeCombustivel(300);
        System.out.println("Informe o tipo de combustivel: ");
        bc.alterarCombustivel(leitor.next());
        System.out.println("Informe o valor do combustivel: ");
        bc.alterarValor(leitor.nextDouble());
        
       
        System.out.printf("Abastecer R$50,00: %s litros.",bc.abastecerPorValor(50));
        System.out.println("");
        System.out.printf("Quantidade de combustível na bomba: %s", bc.getQtdeCombustivel());
        System.out.println("");
        System.out.printf("Abastecer 10 litros: %s litros.",bc.abastecerPorLitro(10));
        System.out.println("");
        System.out.printf("Quantidade de combustível na bomba: %s", bc.getQtdeCombustivel());
    }
}
