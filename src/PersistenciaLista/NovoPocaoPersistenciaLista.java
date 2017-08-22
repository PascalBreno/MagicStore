
package PersistenciaLista;
import Entidades.Pocao;
import Persistencia.persistenciaPocao;
import java.util.ArrayList;
import java.util.List;


public class NovoPocaoPersistenciaLista 
        implements persistenciaPocao {

    private List lista = new ArrayList();

    @Override
    public void inserir(Pocao novoPocao) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Pocao ultimo = (Pocao) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoPocao.setId(ultimoId + 1);
        lista.add(novoPocao);
    }

    @Override
    public void alterar(Pocao novoPocao) {
        for (int i = 0; i < lista.size(); i++) {
            Pocao elem = (Pocao) lista.get(i);
            if(novoPocao.getId() == elem.getId()){
                lista.set(i, novoPocao);
            }
        }
    }

    @Override
    public void remover(Pocao novoPocao) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Pocao elemento = (Pocao) lista.get(posicao);
            if (elemento.getId() == novoPocao.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Pocao buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Pocao elem = (Pocao) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }

    @Override
  public List<Pocao> getAll(){
      return lista;
  }
 
}