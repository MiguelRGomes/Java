
package br.com.unifacef.exz0.lista1;

import javax.swing.JOptionPane;

public class Produto {
    int id, qtde;
    String descricao;
    float preco;

    Produto(){
        
    }
    
    Produto (int id, String descricao, int qtde, float preco){
        this.id  = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    void aumentar(float x){
        this.preco += x;
    }
    
    void diminuir(float x){
        this.preco -= x;
    }
    
    void comprar(int x){
        this.qtde += x;
    }
    
    void vender(int x){
        this.qtde -= x;
    }
    
    void mostra(){
        JOptionPane.showMessageDialog(null, "ID" + this.id + 
                " Descrição " + this.descricao + " Qtde: " + this.qtde + 
                " Preço: " + this.preco);
    }
}

