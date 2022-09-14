public class Conferente {
    private String nome, cpf, funcao, salario;
    private int horaextra, telefone;

    public Conferente() {
    }

    public Conferente(String nome, String cpf, String funcao, String salario, int horaextra, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.salario = salario;
        this.horaextra = horaextra;
        this.telefone = telefone;
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

    public int getHoraextra() {
        return horaextra;
    }

    public void setHoraextra(int horaextra) {
        this.horaextra = horaextra;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Conferente{" + "nome=" + nome + ", cpf=" + cpf + ", funcao=" + 
                funcao + ", salario=" + salario + ", horaextra=" + horaextra + ", telefone=" + telefone + '}';
    }
    
    
}
