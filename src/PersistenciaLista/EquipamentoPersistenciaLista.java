    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaLista;

import Entidades.Equipamento;
import java.util.ArrayList;
import java.util.List;
import Persistencia.persistenciaEquipamento;

/**
 *
 * @author pascal
 */
public class EquipamentoPersistenciaLista
        implements persistenciaEquipamento{
    public List lista = new ArrayList();
    
public void inserir(Equipamento novoEquipamento) {
    int ultimoId = 0;
    if (lista.size() > 0) {
        int posicaoUltimo = lista.size() - 1;
        Equipamento ultimo = (Equipamento) lista.get(posicaoUltimo);
        ultimoId = ultimo.getId();
    }   
    novoEquipamento.setId(ultimoId + 1);
    lista.add(novoEquipamento);
    }

 public void alterar(Equipamento novoEquipamento) {
        for (int i = 0; i < lista.size(); i++) {
            Equipamento elem = (Equipamento) lista.get(i);
            if(novoEquipamento.getId() == elem.getId()){
                lista.set(i, novoEquipamento);
            }
        }
    }
  public void remover(Equipamento novoEquipamento) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Equipamento elemento = (Equipamento) lista.get(posicao);
            if (elemento.getId() == novoEquipamento.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }
   public Equipamento buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Equipamento elem = (Equipamento) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
        }
        return null;
    }
 public List<Equipamento> getAll(){
      return lista;
  }
}

