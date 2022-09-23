/*
Escreva uma classe Data cuja inst�ncia (objeto) represente uma data. Esta classe dever� dispor dos 
seguintes m�todos:
a. Construtor: define a data que determinado objeto (atrav�s de par�metro), este m�todo verifica se a 
data est� correta, caso n�o esteja a data � configurada como 01/01/0001
b. Compara: recebe como par�metro um outro objeto da Classe data, compare com a data corrente e 
retorne: 
i. 0 se as datas forem iguais; 
ii. 1 se a data corrente for maior que a do par�metro; 
iii. -1 se a data do par�metro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o m�s da data
e. GetMesExtenso: retorna o m�s da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contr�rio
h. Clone: o objeto clona a si pr�prio, para isto, ele cria um novo objeto da classe Data com os 
mesmos valores de atributos e retorna sua refer�ncia pelo m�todo
 */
package Exercicio8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author deiam
 */
public class Data {
    private Date data;
    private String copia;

    public Data(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        this.data = formato.parse(data);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    public int Compara(Date data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = formato.parse(formato.format(new Date()));
        if(dataAtual.equals(data)){
            return 0;
        }else if (dataAtual.after(data)){
            return 1;
        }else{
            return -1;
        }
    }
    
    public int getDia(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.getData());
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        return dia;
    } 
    
    public int getMes(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.getData());
        int mes = cal.get(Calendar.MONTH)+1;
        return mes;
    } 
    
    public String getMesExtenso(){
        int mes = this.getMes();
        String mesExtenso = "";
        
        switch(mes){
            case 1:
                mesExtenso = "janeiro";
                break;
            case 2:
                mesExtenso = "fevereiro";
                break;
            case 3:
                mesExtenso = "mar�o";
                break;
            case 4:
                mesExtenso = "abril";
                break;
            case 5:
                mesExtenso = "maio";
                break;
            case 6:
                mesExtenso = "junho";
                break;
            case 7:
                mesExtenso = "julho";
                break;
            case 8:
                mesExtenso = "agosto";
                break;
            case 9:
                mesExtenso = "setembro";
                break;
            case 10:
                mesExtenso = "outubro";
                break;
            case 11:
                mesExtenso = "novembro";
                break;
            case 12:
                mesExtenso = "dezembro";
                break;
        }
       return mesExtenso;
    } 
    
    public int getAno(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.getData());
        int dia = cal.get(Calendar.YEAR);
        return dia;
    } 
    
    public boolean isBissexto(){
        int ano = this.getAno();
        boolean isBissexto = false;
        
        if(ano % 4 == 0){
            if(ano % 400 == 0 || ano % 100 != 0){
                isBissexto = true;
            }
        }
        return isBissexto;
    }
    
    public Data(Data copia) {
        this.copia = copia.copia; 
    }
}
    
