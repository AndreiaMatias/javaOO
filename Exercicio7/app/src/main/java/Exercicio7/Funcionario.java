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

/**
 *
 * @author deiam
 */
public class Funcionario {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0){
            this.salarioMensal = 0.0;
        }else{
            this.salarioMensal = salarioMensal;
        }
    }
    
    public double salarioAnual(double salarioMensal){
        return salarioMensal * 12;
    }
}
