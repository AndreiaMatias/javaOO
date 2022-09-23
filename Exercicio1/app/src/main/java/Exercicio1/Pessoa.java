/*
Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa. 

*/

package Exercicio1;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author deiam
 */
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dtNascimento) throws ParseException {
        this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dtNascimento);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0){
            this.altura = 0;
        }else{
            this.altura = altura;
        }
    }
    
    public int calculaIdade(Date dataNascimento){
        int idade = 0;
        int anoAtual = new Date().getYear();
        int anoNascimento = dataNascimento.getYear();
        idade = anoAtual - anoNascimento;
        return idade;
    }

    public void dadosPessoa(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("Idade: " + this.calculaIdade(dataNascimento));
        System.out.println("Altura: " + String.format("%,.2f", this.altura));
    }
    
    
}
