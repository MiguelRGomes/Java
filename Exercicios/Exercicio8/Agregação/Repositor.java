
public class Repositor {
    private String nome, cpf, funcao, salario;
    private int codigoSetor;

    public Repositor() {
    }

    public Repositor(String nome, String cpf, String funcao, String salario, int codigoSetor) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
        this.codigoSetor = codigoSetor;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    @Override
    public String toString() {
        return "Repositor{" + "nome=" + nome + ", cpf=" + cpf + ", funcao=" 
                + funcao + ", salario=" + salario + ", codigoSetor=" + codigoSetor + '}';
    }

    
    
    
}
