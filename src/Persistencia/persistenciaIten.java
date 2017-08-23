/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Iten;
import java.util.List;

/**
 *
 * @author pascal
 */
public interface persistenciaIten {
    public void inserir(Iten novoItem);
    public void alterar(Iten novoItem);
    public void remover(Iten novoItem);
    public List<Iten> getAll();
}
