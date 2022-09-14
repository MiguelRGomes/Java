
package Objeto;

import java.util.Date;

public class TesteVoo {

    public static void main(String[] args) {
        Passageiro p =new Passageiro();
        Voo v = new Voo();
        Reserva re = new Reserva(1234, new Date(), p , v);
        
        System.out.println(re.toString());
    }
}   