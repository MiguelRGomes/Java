package br.com.unifacef.exz0.lista1;

public class TesteRio {
    
    public static void main(String[] args){
        Rio obj1 = new Rio("Amazonas", 0.5f, false);
        
        obj1.mostra();
        
        obj1.sujar();
        obj1.limpar();
                
        obj1.mostra();
                        
        obj1.limpar();
        obj1.ensolarar(0.2f);

        obj1.mostra();
        
        

    }
    
}
