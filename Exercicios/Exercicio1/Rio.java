 package br.com.unifacef.exz0.lista1;

import javax.swing.JOptionPane;

 
public class Rio {
       
    private String nome;
    private float nivel;
    private boolean poluido;
    
    Rio(){
        
    }
    
    Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    void chover(float x){
        this.nivel += x;
    }
    
    void ensolarar(float x){
        this.nivel -= x;
    }
    
    void sujar(){
        this.poluido = true;
    }
    
    void limpar(){
        this.poluido = false;
    }
    
    void mostra(){
        JOptionPane.showMessageDialog(null, "Nome " + this.nome + 
                " Nível " + this.nivel + " Poluido: " + this.poluido);
    }
}
