/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author Tic_Cdpsa
 */
public class Produtos {
    private String quantidade;
    private String produto;

    public Produtos(String quantidade, String produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

 

  

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
