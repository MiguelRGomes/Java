package lista6;

public class Diretor extends Funcionario{
    private float valorCarro;
    private String carro;

    public Diretor() {
    }
    
    public Diretor(float valorCarro, String carro, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.valorCarro = valorCarro;
        this.carro = carro;
    }

    public float getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(float valorCarro) {
        this.valorCarro = valorCarro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Diretor{" + "valorCarro=" + valorCarro + ", carro=" + carro +
                super.toString() + '}';
    }
    
    @Override 
    public float calculaSalarioFinal(){
        return (this.salario + this.valorCarro + 5/100);
    }
    
}
