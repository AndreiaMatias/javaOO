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
                System.out.print("Próximo assento livre: ");
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
            System.out.println("Operação bem sucedida.");
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
