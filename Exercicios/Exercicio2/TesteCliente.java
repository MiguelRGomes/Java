
import javax.swing.JOptionPane;

public class TesteCliente {
    
    public static void mais(String [] args){
        Cliente obj1 = new Cliente("31231",  "43243423", "Felipe", 1000);
        obj1.sacar(1300);
        JOptionPane.showMessageDialog(null,obj1.mostra());
    }
}
