
package lista7;


public class NaoMotorizado extends Veiculo{
    private String meioLocomocao;

    public NaoMotorizado() {
    }

    public NaoMotorizado(String meioLocomocao, String nome, String modelo) {
        super(nome, modelo);
        this.meioLocomocao = meioLocomocao;
    }

    public String getMeioLocomocao() {
        return meioLocomocao;
    }

    public void setMeioLocomocao(String meioLocomocao) {
        this.meioLocomocao = meioLocomocao;
    }

    @Override
    public String toString() {
        return "NaoMotorizado{" + "meioLocomocao=" + meioLocomocao + 
                super.toString() + '}';
    }
    
    
    @Override
    public float comoLocomove() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
