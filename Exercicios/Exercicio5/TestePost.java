
package lista5;

public class TestePost {

    public static void main(String[] args) {
        Post p1 = new Post(1, "Fulano", "Vamos ajudar no trote!");
        
        Comentarios c1 = new Comentarios(10, "Léo", "Vou doar sangue");
        Comentarios c2 = new Comentarios(10, "Miguel", "Vou doar suplementos");
        Comentarios c3 = new Comentarios(10, "Arthur", "Vou doar alimentos");
        
        p1.addComentarios(c1);
        p1.addComentarios(c2);
        p1.addComentarios(c3);
        System.out.println(p1.toString());
        p1.removeComentarios(c1);
        System.out.println(p1.toString());
        
    }
    
}
