/*
 Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os m�todos p�blicos necess�rios para getters e setters e tamb�m um m�todo para imprimir 
todos dados de uma pessoa. Crie um m�todo para calcular a idade da pessoa. 
 */
package Exercicio1;

import java.text.ParseException;
import java.util.Scanner;

public class App {
        
    public static void main(String[] args) throws ParseException {
        Scanner leitor = new Scanner(System.in);
        Pessoa p = new Pessoa();
        System.out.println("Informe o nome: ");
        p.setNome(leitor.next());
        System.out.println("Informe a data de nascimento no formato dd/mm/aaaa: ");
        p.setDataNascimento(leitor.next());
        System.out.println("Informe a altura: ");
        p.setAltura(leitor.nextFloat());
        
        p.dadosPessoa();
    }
}
