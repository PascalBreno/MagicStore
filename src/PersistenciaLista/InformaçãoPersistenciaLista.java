
package PersistenciaLista;
import Entidades.Informação;
import Persistencia.persistenciaInformações;
import java.util.ArrayList;
import java.util.List;


public class InformaçãoPersistenciaLista 
        implements persistenciaInformações {

    private List lista = new ArrayList();

    public void inserir(Informação novoInformação) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Informação ultimo = (Informação) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoInformação.setId(ultimoId + 1);
        lista.add(novoInformação);
    }

    public void alterar(Informação novoInformação) {
        for (int i = 0; i < lista.size(); i++) {
            Informação elem = (Informação) lista.get(i);
            if(novoInformação.getId() == elem.getId()){
                lista.set(i, novoInformação);
            }
        }
    }

    public void remover(Informação novoInformação) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Informação elemento = (Informação) lista.get(posicao);
            if (elemento.getId() == novoInformação.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    public Informação buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Informação elem = (Informação) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }

  public List<Informação> getAll(){
      return lista;
  }
 
}