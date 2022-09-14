
public class Estoque {
    private String tipo, responsavelCoferente, responsavelRepositor, localizacao;

    public Estoque() {
    }

    public Estoque(String tipo, String responsavelCoferente, String responsavelRepositor, String localizacao) {
        this.tipo = tipo;
        this.responsavelCoferente = responsavelCoferente;
        this.responsavelRepositor = responsavelRepositor;
        this.localizacao = localizacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getResponsavelCoferente() {
        return responsavelCoferente;
    }

    public void setResponsavelCoferente(String responsavelCoferente) {
        this.responsavelCoferente = responsavelCoferente;
    }

    public String getResponsavelRepositor() {
        return responsavelRepositor;
    }

    public void setResponsavelRepositor(String responsavelRepositor) {
        this.responsavelRepositor = responsavelRepositor;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Estoque{" + "tipo=" + tipo + ", responsavelCoferente=" + responsavelCoferente + 
                ", responsavelRepositor=" + responsavelRepositor + ", localizacao=" + localizacao + '}';
    }
    
    
}
