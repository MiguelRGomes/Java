
import java.util.Date;

public class TesteCarrinho {
    public static void main(String[] args){
        Carrinho car1 = new Carrinho(1, new Date());
        
        ItemCarrinho cr1 = new ItemCarrinho("SSD 240", 1, 100, 200); 
        ItemCarrinho cr2 = new ItemCarrinho("Monitor ", 2, 101, 800); 
        car1.addItemCarrinho(cr1);
        car1.addItemCarrinho(cr2);
        
        System.out.println(car1.toString());
        car1.removeItemCarrinho(cr2);
        System.out.println(car1.toString());
        
        
        
    }
}
