/*
 Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os 
dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto 
tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se 
aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35
 */
package Exercicio10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author deiam
 */
public class Jogador {
    private String nome;
    private String posicao;
    private Date dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador(String nome, String posicao, String dataNascimento, String nacionalidade, double altura, double peso) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formato.parse(dataNascimento);
        this.nome = nome;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formato.parse(dataNascimento);
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public int consultarIdade(Date dataNascimento){
        Calendar hoje = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        int anoAtual = hoje.get(Calendar.YEAR);
        int anoNascimento  = Integer.parseInt(formato.format(dataNascimento));
        return anoAtual - anoNascimento;
    }
    
    public int alcancarAposentadoria(int idade){
        int idadeParaAposentadoria = 0;
        if(posicao.equals("defesa")){
            idadeParaAposentadoria = 40;
        }else if(posicao.equals("meio-campo")){
            idadeParaAposentadoria = 38;
        }else if(posicao.equals("atacante")){
            idadeParaAposentadoria = 35;
        }else{
            System.out.println("Posição Inválida");
        }
        if(idadeParaAposentadoria - idade > 0){
            int tempoFaltante = idadeParaAposentadoria - idade;
            return tempoFaltante;
        }else{
            System.out.println("Tempo para aposentadoria já atingido.");
            return 0;
        }
    }
    
    public void imprimirDados(){
        System.out.println("Informações do jogador:");
        System.out.println("=========================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Posição: " + this.getPosicao());
        System.out.println("Data de nascimento: " + this.getDataNascimento());
        System.out.println("Idade: " + this.consultarIdade(this.dataNascimento));
        System.out.println("Anos de trabalho até a aposentadoria: " + this.alcancarAposentadoria(this.consultarIdade(this.getDataNascimento())));
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());

    }
    
}
