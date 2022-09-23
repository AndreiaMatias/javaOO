/*
 Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para 
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações 
como atributos:
a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.
Curso de Lógica para Programação III
Instrutor: Marcio Michelluzzi
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela 
deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. 
Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método 
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por 
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
