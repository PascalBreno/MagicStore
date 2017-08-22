
package Persistencia;

import Entidades.Informação;
import java.util.List;


public interface persistenciaInformações {
    public void inserir(Informação novoInformações);
    
    public void alterar(Informação novoInformações);
    
    public void remover(Informação novoInformações);
    
    public List<Informação> getAll();
}