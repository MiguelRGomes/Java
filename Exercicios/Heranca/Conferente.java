
import java.sql.Time;

public class Conferente extends Funcionario { // herança a class pai funcionario(funcionario)
    private int telefone;
    private int  horaextra;

    public Conferente() {
    }

    public Conferente(int telefone, int horaextra, String nome, String cpf, String funcao, float salario) {
        super(nome, cpf, funcao, salario);
        this.telefone = telefone;
        this.horaextra = horaextra;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getHoraextra() {
        return horaextra;
    }

    public void setHoraextra(int horaextra) {
        this.horaextra = horaextra;
    }

    @Override
    public String toString() {
        return "Conferente{" + "telefone=" + telefone + ", horaextra=" + horaextra +
                        super.toString() + '}';
    }
    
    @Override 
    public int informacao(){
        return this.telefone;
    }
    
    @Override 
    public float informacao2(){
        return this.salario ;
    }
       
    
    
}


