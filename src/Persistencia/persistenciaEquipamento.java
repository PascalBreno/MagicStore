
package Persistencia;

import Entidades.Equipamento;
import java.util.List;


public interface persistenciaEquipamento {
    public void inserir(Equipamento novoEquipamento);
    
    public void alterar(Equipamento novoEquipamento);
    
    public void remover(Equipamento novoEquipamento);
    
    public List<Equipamento> getAll();
}