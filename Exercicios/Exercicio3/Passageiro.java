package Objeto;

public class Passageiro {

    private String nome, cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Passageiro() {
	}
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
        @Override  // o tostring da classe objeto é anulado
	public String toString() {
		return "Passageiro{ " +  "Nome: " +  nome + "\nCPF: " + cpf + "}";
	}
    }
