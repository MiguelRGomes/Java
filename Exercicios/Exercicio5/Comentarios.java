
package lista5;

public class Comentarios {
    private int codigo;
    private String autor, texto;

    public Comentarios() {
    }

    public Comentarios(int codigo, String autor, String texto) {
        this.codigo = codigo;
        this.autor = autor;
        this.texto = texto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Comentarios{" + "codigo=" + codigo + ", autor=" + autor + ", texto=" + texto + '}';
    }

    
}
