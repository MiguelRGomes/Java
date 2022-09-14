package Composicao;

public class itemEstoque {
	private int codigo, quantidade;
	private String nome, tipo;
	private float valor;
	
	public itemEstoque () {
		
	}
	
	public itemEstoque(int codigo, int quantidade, String nome, String tipo, float valor) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}	
}
