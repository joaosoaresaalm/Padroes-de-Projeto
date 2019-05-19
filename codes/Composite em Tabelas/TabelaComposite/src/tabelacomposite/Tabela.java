package tabelacomposite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tabela implements Componente {
    private List<Componente> linhas = new ArrayList<Componente>();

    public Collection<Componente> Componentes() {
        return linhas;
    }

    public void adicionar(Linha l) {
        linhas.add(l);
    }

    @Override
    public void imprimir() {}
}