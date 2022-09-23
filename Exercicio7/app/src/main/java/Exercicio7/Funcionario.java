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
