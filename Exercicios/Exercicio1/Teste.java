
package br.com.unifacef.exz0.lista1;
    
import javax.swing.JOptionPane;


public class Teste {
    public static void main(String[] args) {
        System.out.println("Hello World !!!");
        // cria o objeto classe carro
        String auxModelo = JOptionPane.showInputDialog("Informe o modelo");
        int auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
        float auxVelocidade = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade"));
        int opcao = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
        boolean auxMotor;
        if (opcao == JOptionPane.OK_OPTION);
        
        Carro obj1 = new Carro(auxModelo, auxAno, auxVelocidade, false);
        //chamar os metodos
        obj1.ligar();
        obj1.mostrar();
       
        obj1.acelerar(50);
        obj1.mostrar();
        
        obj1.frear(20);
        obj1.mostrar();
        
        obj1.desligar();
        obj1.mostrar();
        
        // criar o objeto
        String auxModelo1 = JOptionPane.showInputDialog("Informe o modelo");
        Carro obj2 = new Carro(auxModelo1, 2012, 0, false); // this represnta obj2
                
        obj2.mostrar();
        obj2.ligar();
        obj2.mostrar();
        obj2.acelerar(80);
        obj2.mostrar();
        obj2.frear(40);
        obj2.mostrar();
        obj2.desligar();
        obj2.mostrar();
    }
    
}
