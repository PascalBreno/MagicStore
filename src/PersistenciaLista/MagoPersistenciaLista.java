/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersistenciaLista;

import Entidades.Mago;
import Persistencia.persistenciaMago;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pascal
 */
public class MagoPersistenciaLista 
        implements persistenciaMago {

    public List lista = new ArrayList();

    @Override
    public void inserir(Mago novoMago) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Mago ultimo = (Mago) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoMago.setId(ultimoId + 1);
        lista.add(novoMago);
    }

    @Override
    public void alterar(Mago novoMago) {
        for (int i = 0; i < lista.size(); i++) {
            Mago elem = (Mago) lista.get(i);
            if(novoMago.getId() == elem.getId()){
                lista.set(i, novoMago);
            }
        }
    }

    @Override
    public void remover(Mago novoMago) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Mago elemento = (Mago) lista.get(posicao);
            if (elemento.getId() == novoMago.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Mago buscar(int id, String raça, String Categoria,
            int idade, String Reino, int level, String nome, 
            String tipodecliente, String classe) {
         for (int i = 0; i < lista.size(); i++) {
            Mago elem = (Mago) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
            if(elem.getRaca().equals(raça)){
                return elem;
            }
            if(elem.getNome().equals(nome)){
                return elem;
            }
            if(elem.getCategoria().equals(Categoria)){
                return elem;    
            }
        }
        return null;
    }
    @Override
  public List<Mago> getAll(){
      return lista;
  }
 
}
