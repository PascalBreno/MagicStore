
package Persistencia;

import Entidades.Pocao;
import java.util.List;


public interface persistenciaPocao {
    public void inserir(Pocao novoPocao);
    
    public void alterar(Pocao novoPocao);
    
    public void remover(Pocao novoPocao);
    
    public List<Pocao> getAll();
}