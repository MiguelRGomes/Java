package Composicao;

import java.util.ArrayList;

public class SetorEstoque {
	private String tipo, responsavel, localizacao;
	private ArrayList<itemEstoque> itens;
	
	public SetorEstoque() {
		this.itens = new ArrayList();
	}

	public SetorEstoque(String tipo, String responsavel, String localizacao) {
		super();
		this.tipo = tipo;
		this.responsavel = responsavel;
		this.localizacao = localizacao;
		this.itens = new ArrayList();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public ArrayList<itemEstoque> getItens() {
		return itens;
	}

	public void setItens(ArrayList<itemEstoque> itens) {
		this.itens = itens;
	}
	
	public void additemEstoque(itemEstoque item) {
		this.itens.add(item);
		System.out.println("\nProdutos cadastrados com sucesso!!");
	}
	public void retiraritemEstoque(itemEstoque item) {
		if(this.itens.remove(item)) {
			System.out.println("Item retirado do estoque!!");
		}
		else
		{
			System.out.println("Quantidade insuficiente no estoque!!");
		}
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + " \nResponsavel:" + responsavel + "\nLocalizacao:" + localizacao
				+ "\nItens:" + itens + "]";
	}
	
	
}
