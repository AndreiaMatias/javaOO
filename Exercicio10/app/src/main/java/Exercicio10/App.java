/*
 Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posi��o;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os m�todos p�blicos necess�rios para getters e setters e tamb�m um m�todo para imprimir todos os 
dados do jogador. Crie um m�todo para calcular a idade do jogador e outro m�todo para mostrar quanto 
tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posi��o de defesa se 
aposentam em m�dia aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35
 */
package Exercicio10;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws ParseException {
        String nome;
        String posicao;
        String dataNascimento;
        String nacionalidade;
        double altura;
        double peso;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o nome do jogador: ");
        nome = leitor.next();
        System.out.println("Informe a posicao do jogador: ");
        posicao = leitor.next();
        System.out.println("Informe a data de nascimento do jogador: ");
        dataNascimento = leitor.next();
        System.out.println("Informe a nacionalidade do jogador: ");
        nacionalidade = leitor.next();
        System.out.println("Informe a altura do jogador: ");
        altura = leitor.nextDouble();
        System.out.println("Informe o peso do jogador: ");
        peso = leitor.nextDouble();
        
        Jogador jog = new Jogador(nome, posicao, dataNascimento, nacionalidade, altura, peso);
        
        jog.imprimirDados();
    }
}
