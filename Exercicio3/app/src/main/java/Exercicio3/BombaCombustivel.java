/*
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os 
seguintes atributos: tipo de combust�vel, valor por litro e quantidade de combust�vel. Al�m desses 
atributos a classes deve conter os seguintes m�todos.
a. abastecerPorValor; //m�todo onde � informado o valor a ser abastecido e mostra a quantidade de 
litros que foi colocada no ve�culo
b. abastecerPorLitro; // m�todo onde � informado a quantidade em litros de combust�vel e mostra o 
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combust�vel.
d. alterarCombustivel; //altera o tipo do combust�vel.
e. alterarQuantidadeCombustivel; //altera a quantidade de combust�vel restante na bomba.
Crie uma classe que contenha um m�todo main para testar sua classe BombaCombust�vel
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
            System.out.println("N�o h� combustivel suficiente.");
            return 0;
        }
    }

    public double abastecerPorLitro(double litrosAAbastecer){
        if(litrosAAbastecer <= qtdeCombustivel){
            this.qtdeCombustivel -= litrosAAbastecer;
            return litrosAAbastecer * this.valorLitro;
        }else{
            System.out.println("N�o h� combustivel suficiente.");
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
