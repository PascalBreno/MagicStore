
package PersistenciaLista;
import Entidades.Funcionario;
import Persistencia.persistenciaFuncionario;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioPersistenciaLista 
        implements persistenciaFuncionario {

    public List lista = new ArrayList();

    @Override
    public void inserir(Funcionario novoFuncionario) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Funcionario ultimo = (Funcionario) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoFuncionario.setId(ultimoId + 1);
        lista.add(novoFuncionario);
    }

    public void alterar(Funcionario novoFuncionario) {
        for (int i = 0; i < lista.size(); i++) {
            Funcionario elem = (Funcionario) lista.get(i);
            if(novoFuncionario.getId() == elem.getId()){
                lista.set(i, novoFuncionario);
            }
        }
    }

    public void remover(Funcionario novoFuncionario) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Funcionario elemento = (Funcionario) lista.get(posicao);
            if (elemento.getId() == novoFuncionario.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    public Funcionario buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Funcionario elem = (Funcionario) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }

  public List<Funcionario> getAll(){
      return lista;
  }
 
}