/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Magos;
import java.util.List;

/**
 *
 * @author pascal
 */
public interface persistenciaMago {
    public void inserir(Magos novoMago);
    
    public void alterar(Magos novoMago);
    
    public void remover(Magos novoMago);
    
    public Magos buscar(int id, String raça, String Categoria,
            int idade, String Reino, int level, String nome, 
            String tipodecliente, String classe);
    
            public List<Magos> getAll();

}
