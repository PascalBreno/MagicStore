/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaLista;

import Entidades.Iten;
import java.util.ArrayList;
import java.util.List;
import Persistencia.persistenciaIten;

/**
 *
 * @author pascal
 */
public class ItenPersistenciaLista implements persistenciaIten {
    
    public List lista = new ArrayList();
    
    public void inserir(Iten novoItem) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Iten ultimo = (Iten) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoItem.setId(ultimoId + 1);
        lista.add(novoItem);
    }
public void alterar(Iten novoItem) {
        for (int i = 0; i < lista.size(); i++) {
            Iten elem = (Iten) lista.get(i);
            if(novoItem.getId() == elem.getId()){
                lista.set(i, novoItem);
            }
        }
    }
 public void remover(Iten novoItem) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Iten elemento = (Iten) lista.get(posicao);
            if (elemento.getId() == novoItem.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }
 public Iten buscar(int id, String nome, float preco) {
         for (int i = 0; i < lista.size(); i++) {
            Iten elem = (Iten) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
            if(elem.getNome().equals(nome)){
                return elem;
            }
        }
        return null;
    }
  public List<Iten> getAll(){
      return lista;
  }




}
