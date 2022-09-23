/*
Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa 
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes métodos para esta classe:
a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final
 */
package Exercicio5;


public class App {
    

    public static void main(String[] args) {
        int matricula = 1;
        String nome = "Andreia";
        double[] notasProvas = {7,8};
        double notaTrabalho = 5;
        AlunosDisciplina aluno = new AlunosDisciplina(matricula, nome, notasProvas, notaTrabalho);
        System.out.println("Média: " + String.format("%,.2f", aluno.media(notasProvas, notaTrabalho)));        
    }
}
