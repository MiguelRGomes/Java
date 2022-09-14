package Objeto;

import java.util.Date;

public class Cartao {
	private String numero, bandeira;
	private int cvv, senha;
	private Date validade;
	private Conta conta;
	
	public Cartao() {
		
	}
	
	public Cartao(String numero, String bandeira, int cvv, int senha, Date validade, Conta conta) {
		super();
		this.numero = numero;
		this.bandeira = bandeira;
		this.cvv = cvv;
		this.senha = senha;
		this.validade = validade;
		this.conta = conta;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public Date GetValidade() {
		return validade;
	}
	public void SetValidade(Date validade) {
		this.validade = validade;
	}
	public int GetSenha() {
		return senha;
	}
	public void SetSenha (int senha) {
		this.senha = senha;
	}
	public void SetCvv(int cvv) {
		this.cvv = cvv;
	}
	public int GetCvv() {
		return cvv;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String GetBandeira() {
		return bandeira;
	}
	public void SetBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public void mostra() {
		System.out.println("Número: " +  this.numero + 
				"\nSenha: " + this.senha + 
				"\nValidade: " + this.validade +
				"\nBandeira" + this.bandeira +
				"\nCVV: " + this.cvv);
		this.conta.mostra();
	}
	public void sacar(float valor, int senha) {
		//checar validade, senha e saldo da conta
		//if tudo ok pode fazer a transação
		//Saldo nao pode ficar negativo
		if (this.senha == senha) {
			Date agora = new Date();
			if (agora.before(this.validade)) {
				this.conta.setSaldo(this.conta.getSaldo() - valor);
			}
			else {
				System.out.println("Cartão vencido");
			}
		}
		else {
			System.out.println("Senha inválida!!");
		}
	}
}

