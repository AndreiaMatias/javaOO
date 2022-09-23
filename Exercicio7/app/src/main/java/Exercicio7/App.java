/*
A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as 
três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para 
cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste 
que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada 
instância. Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada 
empregado.

 */
package Exercicio7;


public class App {
    

    public static void main(String[] args) {
        Funcionario funci1 = new Funcionario("Andreia", "Matias", 5000);
        Funcionario funci2 = new Funcionario("Fernando", "Matias", 4750);
        
        System.out.printf("Salário anual de %s %s: %s",funci1.getPrimeiroNome(), funci1.getSobrenome(), funci1.salarioAnual(funci1.getSalarioMensal()));
        System.out.println("");
        System.out.printf("Salário anual de %s %s: %s",funci2.getPrimeiroNome(), funci2.getSobrenome(),funci2.salarioAnual(funci2.getSalarioMensal()));
        System.out.println("");
        
        funci1.setSalarioMensal(funci1.getSalarioMensal()*1.1);
        funci2.setSalarioMensal(funci2.getSalarioMensal()*1.1);
        System.out.println("=====================");
        System.out.println("Salário após aumento");
        System.out.println("=====================");
        System.out.printf("Salário anual de %s %s: %s",funci1.getPrimeiroNome(), funci1.getSobrenome(), funci1.salarioAnual(funci1.getSalarioMensal()));
        System.out.println("");
        System.out.printf("Salário anual de %s %s: %s",funci2.getPrimeiroNome(), funci2.getSobrenome(),funci2.salarioAnual(funci2.getSalarioMensal()));
        System.out.println("");
    }
    
}
