/*
Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa 
classe deve guardar os seguintes dados do aluno: matr�cula, nome, 2 notas de prova e 1 nota de trabalho. 
Escreva os seguintes m�todos para esta classe:
a. media: calcula a m�dia final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele n�o for para a final
 */
package Exercicio5;


public class App {
    

    public static void main(String[] args) {
        int matricula = 1;
        String nome = "Andreia";
        double[] notasProvas = {7,8};
        double notaTrabalho = 5;
        AlunosDisciplina aluno = new AlunosDisciplina(matricula, nome, notasProvas, notaTrabalho);
        System.out.println("M�dia: " + String.format("%,.2f", aluno.media(notasProvas, notaTrabalho)));        
    }
}
