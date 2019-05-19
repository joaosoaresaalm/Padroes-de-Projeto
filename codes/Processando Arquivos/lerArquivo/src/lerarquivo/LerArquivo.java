/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerarquivo;

import java.io.IOException;
/**
 *
 * @author joaos
 */
public class LerArquivo {

    public static void main(String []args) throws IOException{
         
        String texto = Arquivo.lerArquivo("code.txt");
        contabilizaEspaco e = new contabilizaEspaco();
        contabilizarVogal v = new contabilizarVogal();
        contabilizarPonto p = new contabilizarPonto();
        
        e.contador(texto);
        v.contador(texto);
        p.contador(texto);
        
        System.out.println("-----------------------");
        System.out.println("Quantidade de Espaços: " + e.contador(texto));
        System.out.println("-----------------------");
        System.out.println("Qunatidade de vogal 'A':" + v.contador(texto));
        System.out.println("-----------------------");
        System.out.println("Qunatidade de Ponto '.':" + p.contador(texto));     
        
    }      
        
}
        

 
        
        
    