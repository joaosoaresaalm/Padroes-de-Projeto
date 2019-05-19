package lerarquivo;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author joaos
 */

public class Arquivo {
    
    public static String lerArquivo (String caminho){
        String conteudo = "";
        InputStream arquivo = null;
        InputStreamReader leitor = null;
        BufferedReader br = null;
        try {

            arquivo = new FileInputStream(caminho);
            leitor = new InputStreamReader(arquivo);
            br = new BufferedReader(leitor);
            String linha = "";
            linha = br.readLine();
            while (linha!=null){
                conteudo+= linha;
                linha = br.readLine();
                
            }
            
        }catch (FileNotFoundException e){
            System.out.print("Erro ao criar arquivo"+ arquivo);
            
        }catch (IOException e){
            System.out.print("Erro ao ler arquivo"+ arquivo);

        } finally {
            
          try {
            br.close();
            leitor.close();
            arquivo.close();
            
          }catch (IOException e){
            System.out.print("Erro ao fechar arquivo"+ arquivo);
          }

      }

      return conteudo;
  }

}
    









   
        
       

