/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Equipamentos;

/**
 *
 * @author pascal
 */
public interface persistenciaEquipamentos {
    public void inserir(Equipamentos novoEquipamento);
    
    public void alterar(Equipamentos novoEquipamento);
    
    public void remover(Equipamentos novoEquipamento);
    
}
