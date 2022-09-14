package lista6;

public class Assistente extends Funcionario { // herança a class pai funcionario(funcionario)
    private float bonus;

    public Assistente() {
    }
    
    public Assistente(float bonus, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        // super.toString() ->  chama construtor da superclasse
        return "Assistente" + "bonus=" + bonus + 
                super.toString() + '}';
    }
    
    @Override 
    public float calculaSalarioFinal(){
        return this.salario + this.bonus; 
    }
    
}
