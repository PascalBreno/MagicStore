
package Persistencia;

import Entidades.Skill;
import java.util.List;


public interface persistenciaSkill {
    public void inserir(Skill novoSkill);
    
    public void alterar(Skill novoSkill);
    
    public void remover(Skill novoSkill);
    
    public List<Skill> getAll();
}