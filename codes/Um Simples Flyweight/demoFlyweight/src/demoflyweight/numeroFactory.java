/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoflyweight;

import java.util.HashMap;
import java.util.HashMap;

public class numeroFactory {
    
    private static final HashMap numMap = new HashMap();
    
    public static Numero getNumero(int numero){
        
        gerarNumero num = (gerarNumero)numMap.get(numero);
        
        if(num == null){
            num = new gerarNumero(numero);
            numMap.put(numero,num);
            System.out.println("Criando algarismo: "+ numero);
            
        }
        return num;
    }
}
