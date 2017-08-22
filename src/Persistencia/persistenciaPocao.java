
package Persistencia;

import Entidades.Pocoes;
import java.util.List;


public interface persistenciaPocao {
    public void inserir(Pocoes novoPocao);
    
    public void alterar(Pocoes novoPocao);
    
    public void remover(Pocoes novoPocao);
    
    public List<Pocoes> getAll();
}