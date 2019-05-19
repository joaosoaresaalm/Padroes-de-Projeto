package demoflyweight;

public class gerarNumero implements Numero{
    private int numero;
    
    public gerarNumero(int numero){
        this.numero = numero;
    }
    @Override
    public void algarismos() {
        System.out.println("O numero é: "+ numero);
        
    }
    public int getNum() {
        return this.numero;
    }
    
}
