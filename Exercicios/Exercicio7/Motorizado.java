package lista7;


public class Motorizado extends Veiculo{
    private float potencia;
    private String combustivel;

    public Motorizado() {
    }

    public Motorizado(float potencia, String combustivel, String nome, String modelo) {
        super(nome, modelo);
        this.potencia = potencia;
        this.combustivel = combustivel;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Motorizado{" + "potencia=" + potencia + ", combustivel=" + combustivel + 
                super.toString() + '}';
    }
    
    @Override
    public float comoLocomove() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
