/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivo;

public class contabilizaEspaco implements Contador {
   public int contador(String linha){
        String digitos = " ";
        int total_brancos = 0;
        char[] d = linha.toCharArray();   
        
        int NumeroLetras = linha.length();
        for(int i = 0; i < NumeroLetras; i++){
            if(digitos.indexOf(d[i]) >= 0)
                 total_brancos++;
            }
        return total_brancos++;
    }
       
     
         
     
}
    

