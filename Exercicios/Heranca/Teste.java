public class Teste {
    public static void ERPCadastro(Funcionario funcionario){
        System.out.println(funcionario.toString());// funcionario é polimorfismo
    }
    public static void main(String[] args){
        
        Gerente g1 = new Gerente(500, "Miguel", "445-45", "Gerente", 8000);
        Conferente c1 = new Conferente(991758694, 6, "Arthur", "1245-78", "Conferente de Estoque", 4000);
        Repositor r1 = new Repositor(14, "Leonardo", "545-73", "Repositor", 3000);

        System.out.println(g1.toString());
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        
        ERPCadastro(g1); // Funcionario Funcionario = g1
        ERPCadastro(c1); // Funcionario Funcionario = c1
        ERPCadastro(r1); // Funcionario Funcionario = r1
    }
    
}

