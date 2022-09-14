
public class Gerente extends Funcionario{
    private float comissao;
    private int cargahoraria;

    public Gerente() {
    }

    public Gerente(float comissao, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.comissao = comissao;
        this.cargahoraria = cargahoraria;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Gerente{" + "comissao=" + comissao + ", cargahoraria=" + cargahoraria + 
        super.toString() + '}';
    }

    @Override 
    public int informacao(){
        return this.cargahoraria;
    }
    
    @Override 
    public float informacao2(){
        return this.salario + (this.salario * this.comissao) / 100;
    }
    
}
