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
public class Venda {
    private float PrecoTotal;
    private float Desconto;
    private Date datavenda;
    private String TipodePagamento;

    public float getPrecoTotal() {
        return PrecoTotal;
    }

    public void setPrecoTotal(float PrecoTotal) {
        this.PrecoTotal = PrecoTotal;
    }

    public float getDesconto() {
        return Desconto;
    }

    public void setDesconto(float Desconto) {
        this.Desconto = Desconto;
    }

    public Date getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(Date datavenda) {
        this.datavenda = datavenda;
    }

    public String getTipodePagamento() {
        return TipodePagamento;
    }

    public void setTipodePagamento(String TipodePagamento) {
        this.TipodePagamento = TipodePagamento;
    }
}
