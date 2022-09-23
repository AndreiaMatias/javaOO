/*
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os 
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses 
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de 
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o 
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível
 */
package Exercicio3;

/**
 *
 * @author deiam
 */
public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double qtdeCombustivel;
    
    public double abastecerPorValor(double ValorAAbastecer){
        double litrosAbastecidos = ValorAAbastecer / this.valorLitro;
        if(litrosAbastecidos <= qtdeCombustivel){
            this.qtdeCombustivel -= litrosAbastecidos;
            return litrosAbastecidos;
        }else{
            System.out.println("Não há combustivel suficiente.");
            return 0;
        }
    }

    public double abastecerPorLitro(double litrosAAbastecer){
        if(litrosAAbastecer <= qtdeCombustivel){
            this.qtdeCombustivel -= litrosAAbastecer;
            return litrosAAbastecer * this.valorLitro;
        }else{
            System.out.println("Não há combustivel suficiente.");
            return 0;
        }
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void alterarValor(double valorLitro){
        this.valorLitro = valorLitro;
    }

    public double getQtdeCombustivel() {
        return qtdeCombustivel;
    }

    public void alterarQuantidadeCombustivel(double qtdeCombustivel) {
        this.qtdeCombustivel = qtdeCombustivel;
    }
    
    
}
