
package lista6;
// o pai é abstract porque a class não pode ser instancia, servindo somente de modelo para as filhas
public abstract class Funcionario { 
    //para as filhas herdarem as variaveis, vamos defini-las
    // como protegida
    
    protected String nome, cpf, funcao;
    
    protected float salario; 
    
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String funcao, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() { //ele tem pai? tem pai sim, é a classe Object, que te, toString() padrão
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", funcao=" + funcao + 
                ", salario=" + salario + " Sálario Final= " + this.calculaSalarioFinal() + '}';
    }

    // calcula e retorna o salario final do funcionario
    // metodo abstrato que será implemntado apenas na classes filhas
    public abstract float calculaSalarioFinal(); 
    
    
}
