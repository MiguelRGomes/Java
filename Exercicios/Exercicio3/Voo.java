package Objeto;

public class Voo {
	private int numero;
	private String origem;
	private String destino;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Voo() {
		
	}
	
	@Override
	public String toString() {
		return "Voo(" + "\nNúmero: " + this.numero
				+ "\nOrigem: " + this.origem
				+ "\nDestino: " + this.destino + "\n \n \n \n" + ')';
	}
}
