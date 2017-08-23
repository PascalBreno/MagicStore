import Entidades.Skill;
import Persistencia.persistenciaSkill;
import PersistenciaLista.SkillPersistenciaLista;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SkillPersistenciaArquivo
        extends SkillPersistenciaLista
        implements persistenciaSkill {

    private final String arq = "Skill.db";
    public SkillPersistenciaArquivo(){
        ler();
    }
    private void ler() {
        try {
            ObjectInputStream ois;
            FileInputStream fis;
            fis = new FileInputStream(arq);
            ois = new ObjectInputStream(fis);
            lista = (List) ois.readObject();
            ois.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }
    private void gravar(){
        try{
            ObjectOutputStream oos;
            FileOutputStream fos;
            fos = new FileOutputStream(arq);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    public void inserir(Skill novoSkill) {
        super.inserir(novoSkill);
        gravar();
    }
    public void alterar(Skill novoSkill) {
        super.alterar(novoSkill);
        gravar();
    }
    public void remover(Skill novoSkill) {
        super.remover(novoSkill);
        gravar();
    }
}

