package lista6;

public class TesteFuncionario {
    public static void exemploPolimorfismo(Funcionario funcionario){
        System.out.println(funcionario.toString());// funcionario é polimorfismo
    }
    public static void main(String[] args){
        
        Assistente as1 = new Assistente(500, "Léo", "123-45", "TI", 2000);
        Gerente g1 = new Gerente(20, "Arthur", "4545-45", "Comercial", 4000);
        Diretor di1 = new Diretor(50000, "Onix", "Miguel", "445-054", "Tecnologia", 6000);

        System.out.println(as1.toString());
        System.out.println(g1.toString());
        System.out.println(di1.toString());
        
        exemploPolimorfismo(as1); // Funcionario Funcionario = as1
        exemploPolimorfismo(g1); // Funcionario Funcionario = g1
        exemploPolimorfismo(di1); // Funcionario Funcionario = di1
    }
}
