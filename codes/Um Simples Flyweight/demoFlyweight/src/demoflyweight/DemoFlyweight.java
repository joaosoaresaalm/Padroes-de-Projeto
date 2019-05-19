package demoflyweight;

public class DemoFlyweight {
  private static final int numeros [] = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        String valores[] =  new String[10]; 

        for(int i = 0; i < 10; i++) { 
            valores[i] = ""; 
            for (int j = 0; j < 10; j++){ 
                gerarNumero num = (gerarNumero)numeroFactory.getNumero(getRandomNumero());
                num.algarismos();
                valores[i] += Integer.toString(num.getNum()); 
            }
            System.out.println("Valor final é: " + valores[i]); 
        }
        
        System.out.println(valores[0] + " " +
                           valores[1] + " " +
                           valores[2] + " " +
                           valores[3] + " " +
                           valores[4] + " " +
                           valores[5] + " " +
                           valores[6] + " " +
                           valores[7] + " " +
                           valores[8] + " " +
                           valores[9] + " " ); 

       
        }
       
        private static int getRandomNumero(){
            return (int)(Math.random()*numeros.length);
        
    }
}
    

