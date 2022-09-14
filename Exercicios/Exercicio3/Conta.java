/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;

/**
 *
 * @author migue
 */
public class Conta {
    private String numero, agencia, nome;
	private float saldo;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		else {
			System.out.println("Saldo insuficente");
		}
	}
	public Conta() {
	}
	public Conta(String numero, String agencia, String nome, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void mostra() {
		System.out.println("Nome: " +  this.nome + 
				"\nAgencia: " + this.agencia + 
				"\nNúmero: " + this.numero +
				"\nSaldo" + this.saldo);
	}
}
