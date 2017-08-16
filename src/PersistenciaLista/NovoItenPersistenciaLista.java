/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaLista;

import Entidades.Itens;
import Persistencia.persistenciaItens;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pascal
 */
public class NovoItenPersistenciaLista implements persistenciaItens {
    
    private List lista = new ArrayList();
    
    public void inserir(Itens novoItem) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Itens ultimo = (Itens) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoItem.setId(ultimoId + 1);
        lista.add(novoItem);
    }
public void alterar(Itens novoItem) {
        for (int i = 0; i < lista.size(); i++) {
            Itens elem = (Itens) lista.get(i);
            if(novoItem.getId() == elem.getId()){
                lista.set(i, novoItem);
            }
        }
    }
 public void remover(Itens novoItem) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Itens elemento = (Itens) lista.get(posicao);
            if (elemento.getId() == novoItem.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }
 public Itens buscar(int id, String nome, float preco) {
         for (int i = 0; i < lista.size(); i++) {
            Itens elem = (Itens) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
            if(elem.getNome().equals(nome)){
                return elem;
            }
        }
        return null;
    }
  public List<Itens> getAll(){
      return lista;
  }




}
