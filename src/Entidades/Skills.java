/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author breno
 */
public class Skills extends Itens {
    private String Tipo;
    private String RestricaoDeClasse;
    private int RestricaoDeLevel;
    private String descricao;

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the RestricaoDeClasse
     */
    public String getRestricaoDeClasse() {
        return RestricaoDeClasse;
    }

    /**
     * @param RestricaoDeClasse the RestricaoDeClasse to set
     */
    public void setRestricaoDeClasse(String RestricaoDeClasse) {
        this.RestricaoDeClasse = RestricaoDeClasse;
    }

    /**
     * @return the RestricaoDeLevel
     */
    public int getRestricaoDeLevel() {
        return RestricaoDeLevel;
    }

    /**
     * @param RestricaoDeLevel the RestricaoDeLevel to set
     */
    public void setRestricaoDeLevel(int RestricaoDeLevel) {
        this.RestricaoDeLevel = RestricaoDeLevel;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
