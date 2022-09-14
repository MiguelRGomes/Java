package br.com.unifacef.exz0.lista1;
   
public class Carro {
     // declaração da variaveis 
    String modelo; 
    int ano ;
    float velocidade;
    boolean motor; // true(ligado) ou falso(desligado)
    
    // método construtor 
    Carro(String md, int an, float ve, boolean mt){
        this.modelo = md;
        this.ano = an;
        this.velocidade = ve;
        this.motor = mt;
    }
    // métodos
    void ligar(){
        this.motor = true; 
    }
    void desligar() {
        this.motor = false;
    }
    void acelerar(float X) {
        this.velocidade += X;
    }
    void frear(float X) {
        this.velocidade -= X;
    }
    void mostrar(){
        System.out.println("Modelo: " + modelo + " Ano: " + ano + 
                " Velocidade " + velocidade + " Motor " + motor);
    }
}
