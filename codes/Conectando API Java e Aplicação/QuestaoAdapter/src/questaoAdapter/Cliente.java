package uhuu;

public class Cliente {
    public static void main(String[] args) {
        int [][] matriz = {{4, 6, 8, 2, 5}, {8, 12, 16, 4, 10}}; 
        AdapterMap map = new AdapterMap(matriz); 

        map.imprimirMapa(); 
    }
}