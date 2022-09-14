package lista5;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private int codigo, like;
    private String autor, texto; 
    private ArrayList<Comentarios> Comentarios;

    public Post() {
        this.Comentarios = new ArrayList();
    }

    public Post(int codigo, int like, String autor, String texto, ArrayList<Comentarios> Comentarios) {
        this.codigo = codigo;
        this.like = like;
        this.autor = autor;
        this.texto = texto;
        this.Comentarios = Comentarios;
    }

    public Post(int codigo, String autor, String texto) {
        this.codigo = codigo;
        this.autor = autor;
        this.texto = texto;
        this.like = 0;
        this.Comentarios = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
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

    public ArrayList<Comentarios> getComentarios() {
        return Comentarios;
    }

    public void setComentarios(ArrayList<Comentarios> Comentarios) {
        this.Comentarios = Comentarios;
    }

    public void addComentarios(Comentarios Comentarios){
        this.Comentarios.add(Comentarios);
        System.out.println("Comentário Inserido");
    }
    
    public void removeComentarios(Comentarios Comnetarios){
        if (this.Comentarios.remove(Comentarios)){
            System.out.println("Comentário removido");
        }
        else{
            System.out.println("Comentário não existe");
        }
    }
    
    @Override
    public String toString() {
        return "Post{" + "codigo=" + codigo + ", like=" + like + ", autor=" + autor + ", texto=" + texto + ", Comentarios=" + Comentarios + '}';
    }

    
    
    
}
