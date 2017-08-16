    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaLista;

import Entidades.Equipamentos;
import Persistencia.persistenciaEquipamentos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pascal
 */
public class NovoEquipamentoPersistenciaLista
        implements persistenciaEquipamentos{
    private List lista = new ArrayList();
    
public void inserir(Equipamentos novoEquipamento) {
    int ultimoId = 0;
    if (lista.size() > 0) {
        int posicaoUltimo = lista.size() - 1;
        Equipamentos ultimo = (Equipamentos) lista.get(posicaoUltimo);
        ultimoId = ultimo.getId();
    }   
    novoEquipamento.setId(ultimoId + 1);
    lista.add(novoEquipamento);
    }

 public void alterar(Equipamentos novoEquipamento) {
        for (int i = 0; i < lista.size(); i++) {
            Equipamentos elem = (Equipamentos) lista.get(i);
            if(novoEquipamento.getId() == elem.getId()){
                lista.set(i, novoEquipamento);
            }
        }
    }
  public void remover(Equipamentos novoEquipamento) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Equipamentos elemento = (Equipamentos) lista.get(posicao);
            if (elemento.getId() == novoEquipamento.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }
   public Equipamentos buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Equipamentos elem = (Equipamentos) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
        }
        return null;
    }
 public List<Equipamentos> getAll(){
      return lista;
  }
}

