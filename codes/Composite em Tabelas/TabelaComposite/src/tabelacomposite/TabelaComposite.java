package tabelacomposite;

import java.util.Collection;

public class TabelaComposite {

   public static void imprimirTabela(Componente comp) {
    
        Collection<Componente> nos = comp.Componentes();
        if (nos != null)
            for (Componente n : nos)
                imprimirTabela(n);

   
        comp.imprimir();
    }

    public static void main(String[] args) {
        
        Tabela tabela = new Tabela();

        Linha linha = new Linha();
        linha.adicionar(new Celula("Maria"));
        linha.adicionar(new Celula("Joao"));
        linha.adicionar(new Celula("Manu"));
        linha.adicionar(new Celula("Manoel"));
        
        linha.adicionar(new Celula("Hevlla"));
        linha.adicionar(new Celula("Rennan"));
        linha.adicionar(new Celula("Aurelio"));
        linha.adicionar(new Celula("Anderson"));
        linha.adicionar(new Celula("William"));
        linha.adicionar(new Celula("Padin"));
       
        tabela.adicionar(linha);
        
        imprimirTabela(tabela);
    }
    
}
