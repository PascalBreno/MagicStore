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
public class Informação extends Itens {
    private String TipoDeInformacao;
    private String referente;
    private String Informação;

    public String getTipoDeInformacao() {
        return TipoDeInformacao;
    }

    public void setTipoDeInformacao(String TipoDeInformacao) {
        this.TipoDeInformacao = TipoDeInformacao;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String getInformação() {
        return Informação;
    }

    public void setInformação(String Informação) {
        this.Informação = Informação;
    }
}
