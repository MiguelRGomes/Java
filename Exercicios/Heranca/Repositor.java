public class Repositor extends Funcionario{
    private int codigoSetor;

    public Repositor() {
    }

    public Repositor(int codigoSetor, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.codigoSetor = codigoSetor;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    @Override
    public String toString() {
        return "Repositor{" + "codigoSetor=" + codigoSetor +
        super.toString() + '}';

    }
    
   
    @Override 
    public int informacao(){
        return this.codigoSetor; 
    }
    
    @Override 
    public float informacao2(){
        return this.salario;
    }
    
}
