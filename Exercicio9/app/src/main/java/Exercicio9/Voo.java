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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author deiam
 */
public class Voo {
    private int numeroVoo;
    private Date data;
    private int proximoLivre;
    private int[] assentos; 

    public Voo(int numeroVoo, String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.numeroVoo = numeroVoo;
        this.data = formato.parse(data);
        this.assentos = new int[100];
    }
    
    public int proximoLivre(){
        int i = 0;
        boolean assentoLivre = false;
        
        for(; i < assentos.length; i++){
            if(assentos[i] == 0){
                System.out.print("Pr�ximo assento livre: ");
                assentoLivre = true;
                break;
            }
        }
        if(assentoLivre == true){
            return i + 1;
        }else{
            return 0;
        }
    }

    public int getVoo() {
        return numeroVoo;
    }

    public void setVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public boolean verifica(int assento){
        if(this.assentos[assento-1] == 0){
            return true; //livre
        }else{
            return false; //ocupado
        }
    }
    
    public boolean ocupa(int assento){
        if(this.assentos[assento-1] == 0){
            assentos[assento-1] = 1;
            System.out.println("Opera��o bem sucedida.");
            return true; //ocupada
        }else{
            System.out.println("Assento ocupado.");
            return false; //livre
        }
    }
    
    public int vagas(){
        int assentosLivres = 0;
        for(int i = 0; i < assentos.length; i++){
            if(assentos[i] == 0){
                assentosLivres++;
            }
        }
        return assentosLivres;
    }
}
