/*
 Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa 
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final
 */
package Exercicio5;

/**
 *
 * @author deiam
 */
public class AlunosDisciplina {
    
    private int matricula;
    private String nome;
    private double[] notasProva = new double[2];
    private double notaTrabalho;

    public AlunosDisciplina(int matricula, String nome, double[] notasProva, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notasProva = notasProva;
        this.notaTrabalho = notaTrabalho;
    }
    
    public double media(double[] notasProva, double notaTrabalho){
        double somaProvas = 0;
        double contadorProva =0;
        double pesoProva = 2.5;
        double pesoTrabalho = 2;
        double media = 0;
        for(double nota: notasProva){
            somaProvas += nota * pesoProva;
            contadorProva++;
        }
        media = (somaProvas + (notaTrabalho * pesoTrabalho))/(pesoProva * contadorProva + pesoTrabalho);
        return media;
    }    
    
    
}
