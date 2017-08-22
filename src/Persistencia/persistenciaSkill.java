
package Persistencia;

import Entidades.Skills;
import java.util.List;


public interface persistenciaSkill {
    public void inserir(Skills novoSkill);
    
    public void alterar(Skills novoSkill);
    
    public void remover(Skills novoSkill);
    
    public List<Skills> getAll();
}