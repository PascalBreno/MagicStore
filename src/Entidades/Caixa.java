/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author breno
 */
public class Caixa {
    private float atualOuro;
    private float atualPrata;
    private float atualBronze;
    private float FinalOuro;
    private float FinalPrata;
    private float FinalBronze;
    private Date dia;

    public float getAtualOuro() {
        return atualOuro;
    }

    public void setAtualOuro(float atualOuro) {
        this.atualOuro = atualOuro;
    }

    public float getAtualPrata() {
        return atualPrata;
    }

    public void setAtualPrata(float atualPrata) {
        this.atualPrata = atualPrata;
    }

    public float getAtualBronze() {
        return atualBronze;
    }

    public void setAtualBronze(float atualBronze) {
        this.atualBronze = atualBronze;
    }

    public float getFinalOuro() {
        return FinalOuro;
    }

    public void setFinalOuro(float FinalOuro) {
        this.FinalOuro = FinalOuro;
    }

    public float getFinalPrata() {
        return FinalPrata;
    }

    public void setFinalPrata(float FinalPrata) {
        this.FinalPrata = FinalPrata;
    }

    public float getFinalBronze() {
        return FinalBronze;
    }

    public void setFinalBronze(float FinalBronze) {
        this.FinalBronze = FinalBronze;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
}
