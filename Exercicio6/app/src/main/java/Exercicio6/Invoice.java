/*
 Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de inform�tica para 
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informa��es 
como atributos:
a. o n�mero do item faturado,
b. a descri��o do item,
c. a quantidade comprada do item e
d. o pre�o unit�rio do item.
Curso de L�gica para Programa��o III
Instrutor: Marcio Michelluzzi
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade n�o for positiva, ela 
deve ser configurada como 0. Se o pre�o por item n�o for positivo ele deve ser configurado como 0.0. 
Forne�a os m�todos getters e setters para cada vari�vel de inst�ncia. Al�m disso, forne�a um m�todo 
chamado getInvoiceAmount que calcula o valor da fatura (isso �, multiplica a quantidade pelo pre�o por 
item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as 
capacidades da classe Invoice.
 */
package Exercicio6;

/**
 *
 * @author deiam
 */
public class Invoice {
    private int codigoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }
    
    public double getInvoiceAmount(){
        return quantidade * precoUnitario;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            this.quantidade = 0;
        }else{
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario < 0){
            this.precoUnitario = 0;
        }else{
            this.precoUnitario = precoUnitario;
        }
    }
}
