/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivo;

/**
 *
 * @author joaos
 */
public class contabilizarVogal implements Contador{
    
    public int contador(String linha){
       String vogais = "aA";
       int total_vogais = 0;
       char[] v = linha.toCharArray();

       int NumeroLetras = linha.length();
       for(int i = 0; i < NumeroLetras; i++){
           if(vogais.indexOf(v[i]) >= 0){
                total_vogais++;
               }
       }
       return total_vogais;
    }
    
}
