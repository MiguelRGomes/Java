
package lista7;


public abstract class Veiculo {
    protected String nome;
    protected String modelo;

    public Veiculo() {
    }

    public Veiculo(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "nome=" + nome + ", modelo=" + modelo + '}';
    }
    
     // calcula e retorna o salario final do funcionario
    // metodo abstrato que será implemntado apenas na classes filhas
    public abstract float comoLocomove(); 
    
    
}
