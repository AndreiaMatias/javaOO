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

public class App {
   

    public static void main(String[] args) {
        Elevador e = new Elevador();
        
        e.inicializa(8, 16);
        e.desce();
        e.sai();
        
        
        e.entra();
        e.entra();
        e.entra();
        e.entra();
        e.entra();
        e.entra();
        e.entra();
        e.sobe();
        e.sobe();
        e.sobe();
        e.sai();
        e.sai();
        e.entra();
        e.entra();
        e.entra();
        e.entra();
        e.sobe();
        e.sobe();
        e.sobe();
        e.sai();
        e.sai();
        e.sai();
        e.sai();
        e.sai();
        e.sai();
        e.desce();
        e.desce();
        e.desce();
        e.desce();
        e.desce();
    }
}
