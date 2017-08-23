
package PersistenciaLista;
import Entidades.Fornecedor;
import Persistencia.persistenciaFornecedor;
import java.util.ArrayList;
import java.util.List;


public class FornecedorPersistenciaLista 
        implements persistenciaFornecedor {

    public List lista = new ArrayList();

    @Override
    public void inserir(Fornecedor novoFornecedor) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Fornecedor ultimo = (Fornecedor) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoFornecedor.setId(ultimoId + 1);
        lista.add(novoFornecedor);
    }

    @Override
    public void alterar(Fornecedor novoFornecedor) {
        for (int i = 0; i < lista.size(); i++) {
            Fornecedor elem = (Fornecedor) lista.get(i);
            if(novoFornecedor.getId() == elem.getId()){
                lista.set(i, novoFornecedor);
            }
        }
    }

    @Override
    public void remover(Fornecedor novoFornecedor) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Fornecedor elemento = (Fornecedor) lista.get(posicao);
            if (elemento.getId() == novoFornecedor.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    public Fornecedor buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Fornecedor elem = (Fornecedor) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }

  public List<Fornecedor> getAll(){
      return lista;
  }
 
}