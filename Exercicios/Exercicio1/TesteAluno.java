package br.com.unifacef.exz0.lista1;

import javax.swing.JOptionPane;

public class TesteAluno {
    
    public static void main(String[] args) {
    int auxNroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
    int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
    String auxNome = JOptionPane.showInputDialog("Informe seu nome");
    float auxP1 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua nota 1"));
    float auxP2 = Float.parseFloat(JOptionPane.showInputDialog("Informe sua nota 2"));
    
    Aluno obj1 = new Aluno(auxNroAluno, auxIdade, auxNome, auxP1, auxP2);
    
    JOptionPane.showMessageDialog(null, obj1.passou());
    
    obj1.dadosAluno();
    JOptionPane.showMessageDialog(null, " Média: " + obj1.notaFinal());
    
    }
}
