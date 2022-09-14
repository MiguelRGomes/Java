
package lista7;

public class TesteVeiculo {
     public static void exemploPolimorfismo(Veiculo veiculo){
        System.out.println(veiculo.toString());// funcionario é polimorfismo
    }
    public static void main(String[] args) {
        Motorizado m1 = new Motorizado(300, "Flex", "CB300", "2012");
        NaoMotorizado nm1 = new NaoMotorizado("Força Humana", "Bike", "2022");
        
        System.out.println(m1.toString());
        System.out.println(nm1.toString());
        
        exemploPolimorfismo(m1); // Funcionario Funcionario = m1
        exemploPolimorfismo(nm1); // Funcionario Funcionario = nm1
              
        
    }
    
}
