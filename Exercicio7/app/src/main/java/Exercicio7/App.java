/*
A fim de representar funcion�rios em uma empresa, crie uma classe chamada Funcionario que inclui as 
tr�s informa��es a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um sal�rio mensal
Sua classe deve ter um construtor que inicializa os tr�s atributos. Forne�a os m�todos getters e setters para 
cada atributo. Se o sal�rio mensal n�o for positivo, configure-o como 0.0. Escreva um aplicativo de teste 
que demonstra as capacidades da classe. Crie duas inst�ncias da classe e exiba o sal�rio anual de cada 
inst�ncia. Ent�o d� a cada empregado um aumento de 10% e exiba novamente o sal�rio anual de cada 
empregado.

 */
package Exercicio7;


public class App {
    

    public static void main(String[] args) {
        Funcionario funci1 = new Funcionario("Andreia", "Matias", 5000);
        Funcionario funci2 = new Funcionario("Fernando", "Matias", 4750);
        
        System.out.printf("Sal�rio anual de %s %s: %s",funci1.getPrimeiroNome(), funci1.getSobrenome(), funci1.salarioAnual(funci1.getSalarioMensal()));
        System.out.println("");
        System.out.printf("Sal�rio anual de %s %s: %s",funci2.getPrimeiroNome(), funci2.getSobrenome(),funci2.salarioAnual(funci2.getSalarioMensal()));
        System.out.println("");
        
        funci1.setSalarioMensal(funci1.getSalarioMensal()*1.1);
        funci2.setSalarioMensal(funci2.getSalarioMensal()*1.1);
        System.out.println("=====================");
        System.out.println("Sal�rio ap�s aumento");
        System.out.println("=====================");
        System.out.printf("Sal�rio anual de %s %s: %s",funci1.getPrimeiroNome(), funci1.getSobrenome(), funci1.salarioAnual(funci1.getSalarioMensal()));
        System.out.println("");
        System.out.printf("Sal�rio anual de %s %s: %s",funci2.getPrimeiroNome(), funci2.getSobrenome(),funci2.salarioAnual(funci2.getSalarioMensal()));
        System.out.println("");
    }
    
}
