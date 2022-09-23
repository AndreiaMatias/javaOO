/*
 Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um 
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o 
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também 
disponibilizar os seguintes métodos: 
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no 
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
 */
package Exercicio4;

/**
 *
 * @author deiam
 */
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdePessoas;
    
    public void inicializa(int capacidadeElevador, int totalAndares){
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qtdePessoas = 0;
    }
    
    public void entra(){
        if(qtdePessoas < capacidadeElevador){
            System.out.println("Pode entrar.");
            this.qtdePessoas++;
        }else{
            System.out.println("Por gentileza, aguarde o próximo elevador.");
        }
    }
    
    public void sai(){
        if(qtdePessoas > 0){
            System.out.println("Tenha um bom dia.");
            this.qtdePessoas--;
        }else{
            System.out.println("Elevador vazio");
        }
    }
    
    public void sobe(){
        if(andarAtual == totalAndares){
            System.out.println("Você está no último andar.");
        }else{
            andarAtual++;
            System.out.println(andarAtual + "º andar");
        }
    }
    
    public void desce(){
        if(andarAtual == 0){
            System.out.println("Você já está no térreo.");
        }else{
            andarAtual--;
            System.out.println(andarAtual + "º andar");
        }
    }
}
