/*
 Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em 
determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a 
ocupação das vagas. A classe deve ter os seguintes métodos:
a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para 
armazenar a data utilize um objeto da classe Data, criada na questão anterior);
b. ProximoLivre: retorna o número da próxima cadeira livre
c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna 
verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso 
contrário
e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
f. GetVoo: retorna o número do vôo
 */
package Exercicio9;

import java.util.Scanner;

import java.text.ParseException;

public class App {
    

    public static void main(String[] args) throws ParseException {
        Scanner leitor = new Scanner(System.in);
        int nrVoo;
        String dataVoo;
        int assentoEscolhido;
        
        System.out.println("Informe o número do voo: ");
        nrVoo = leitor.nextInt();
        System.out.println("Informe a data do voo no formato dd/mm/aaaa: ");
        dataVoo = leitor.next();
        
        
        Voo v = new Voo(nrVoo, dataVoo);
        System.out.println("Número do voo: " + v.getVoo());
        System.out.println("Número de vagas: " + v.vagas());
        System.out.println(v.proximoLivre());
        System.out.print("Informe o assento desejado: ");
        assentoEscolhido = leitor.nextInt();
        System.out.println(v.ocupa(assentoEscolhido));
        System.out.println(v.proximoLivre());
        System.out.println("Quantidades de assentos livres: " + v.vagas());
        System.out.println("Ocupado? " + v.verifica(1));
        //System.out.println("Ocupado? " + v.verifica(2));

        
        
        
        
    }
}
