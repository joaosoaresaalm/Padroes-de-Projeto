package uhuu;

import java.util.Map;
import java.util.HashMap;

public class AdapterMap extends Objeto implements Alvo {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 

    public AdapterMap(int [][] matriz) {
        super(matriz); 
        criarMap(); 
    }

    public void criarMap() { 
        
        for(int i = 0; i < this.getMatriz()[0].length; i++) { 
            this.map.put(this.getMatriz()[0][i], this.getMatriz()[1][i]);
        }
    }

    public Map<Integer, Integer> getMap() {
        return map; 
    } 

    public void imprimirMapa() { 
        
        for (int chave: this.map.keySet()) { 
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + this.map.get(chave) + "\n");
        }
    }

}