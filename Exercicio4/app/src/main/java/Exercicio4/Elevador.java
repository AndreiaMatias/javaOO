/*
 Crie uma classe denominada Elevador para armazenar as informa��es de um elevador dentro de um 
pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de andares no pr�dio (desconsiderando o 
t�rreo), capacidade do elevador e quantas pessoas est�o presentes nele. A classe deve tamb�m 
disponibilizar os seguintes m�todos: 
a. Inicializa: que deve receber como par�metros a capacidade do elevador e o total de andares no 
pr�dio (os elevadores sempre come�am no t�rreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o);
c. Sai: para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele);
d. Sobe: para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
e. Desce: para descer um andar (n�o deve descer se j� estiver no t�rreo);
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
            System.out.println("Por gentileza, aguarde o pr�ximo elevador.");
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
            System.out.println("Voc� est� no �ltimo andar.");
        }else{
            andarAtual++;
            System.out.println(andarAtual + "� andar");
        }
    }
    
    public void desce(){
        if(andarAtual == 0){
            System.out.println("Voc� j� est� no t�rreo.");
        }else{
            andarAtual--;
            System.out.println(andarAtual + "� andar");
        }
    }
}
