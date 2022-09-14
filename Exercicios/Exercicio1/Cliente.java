package br.com.unifacef.exz0.lista1;

import javax.swing.JOptionPane;

public class Cliente {
    int nroConta, nroAgencia;
    String nome;
    float saldo;
    
    Cliente(int nroConta, int nroAgencia, String nome, float saldo){
        this.nroConta = nroConta; 
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    void sacar(float x){
        this.saldo -= x;
    }
    void depositar(float x){
        this.saldo += x;
    }
    void mostar(){
        JOptionPane.showMessageDialog(null, "Número Conta " + this.nroConta +
                " Número agência " + this.nroAgencia + " Nome " + this.nome +
                " Saldo " + this.saldo);
    }
}
