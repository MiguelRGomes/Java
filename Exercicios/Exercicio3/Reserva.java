package Objeto;

import java.util.Date;

public class Reserva {
    
    private int codigo;
    private Date data;
    private Passageiro passageiro;
    private Voo voo;

    Reserva(int i, Date date, Passageiro p, Voo v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public Reserva() {
	}
	public Reserva(int codigo, Date data) {
		this.codigo = codigo;
		this.data = data;
	}
        
	@Override
	public String toString() {
		return "Reserva{ " + "Código: " + codigo + "\nData: " + data + "}";
	}
    }


