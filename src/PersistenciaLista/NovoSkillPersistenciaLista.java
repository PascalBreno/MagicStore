
package PersistenciaLista;
import Entidades.Skill;
import Persistencia.persistenciaSkill;
import java.util.ArrayList;
import java.util.List;


public class NovoSkillPersistenciaLista 
        implements persistenciaSkill {

    private List lista = new ArrayList();

    @Override
    public void inserir(Skill novoSkill) {
    int ultimoId = 0;
        if (lista.size() > 0) {
            int posicaoUltimo = lista.size() - 1;
            Skill ultimo = (Skill) lista.get(posicaoUltimo);
            ultimoId = ultimo.getId();
        }   
        novoSkill.setId(ultimoId + 1);
        lista.add(novoSkill);
    }

    @Override
    public void alterar(Skill novoSkill) {
        for (int i = 0; i < lista.size(); i++) {
            Skill elem = (Skill) lista.get(i);
            if(novoSkill.getId() == elem.getId()){
                lista.set(i, novoSkill);
            }
        }
    }

    @Override
    public void remover(Skill novoSkill) {
          int posicao = 0;

        while (posicao < lista.size()) {
            Skill elemento = (Skill) lista.get(posicao);
            if (elemento.getId() == novoSkill.getId()) {
                lista.remove(posicao);
                break;
            }
            posicao++;
        }
    }

    @Override
    public Skill buscar(int id) {
         for (int i = 0; i < lista.size(); i++) {
            Skill elem = (Skill) lista.get(i);
            if(elem.getId() == id){
                return elem;
            }
         }
        return null;
    }

    @Override
  public List<Skill> getAll(){
      return lista;
  }
 
}