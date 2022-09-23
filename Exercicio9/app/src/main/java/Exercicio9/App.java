/*
 Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em 
determinado hor�rio. Cada v�o possui no m�ximo 100 passageiros, e a classe permite controlar a 
ocupa��o das vagas. A classe deve ter os seguintes m�todos:
a. Construtor: configura os dados do v�o (recebidos como par�metro): n�mero do v�o, data (para 
armazenar a data utilize um objeto da classe Data, criada na quest�o anterior);
b. ProximoLivre: retorna o n�mero da pr�xima cadeira livre
c. Verifica: verifica se o n�mero da cadeira recebido como par�metro est� ocupada
d. Ocupa: ocupa determinada cadeira do v�o, cujo n�mero � recebido como par�metro, e retorna 
verdadeiro se a cadeira ainda n�o estiver ocupada (opera��o foi bem sucedida) e falso caso 
contr�rio
e. Vagas: retorna o n�mero de cadeiras vagas dispon�veis (n�o ocupadas) no v�o
f. GetVoo: retorna o n�mero do v�o
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
        
        System.out.println("Informe o n�mero do voo: ");
        nrVoo = leitor.nextInt();
        System.out.println("Informe a data do voo no formato dd/mm/aaaa: ");
        dataVoo = leitor.next();
        
        
        Voo v = new Voo(nrVoo, dataVoo);
        System.out.println("N�mero do voo: " + v.getVoo());
        System.out.println("N�mero de vagas: " + v.vagas());
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
