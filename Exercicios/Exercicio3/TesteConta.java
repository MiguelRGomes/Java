package Objeto;

import java.util.Calendar;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar data = Calendar.getInstance();
		data.set(Calendar.MONTH, 3);
		data.set(Calendar.YEAR, 2023);
		data.set(Calendar.DAY_OF_MONTH, 06);
		Conta cta1 = new Conta ("12-3", "23-4", "Fulano", 2000);
		
                
		Cartao cra1 = new Cartao ("1234", "Visa", 999, 8888, data.getTime(), cta1);
		cra1.sacar(500, 8888);
		cra1.mostra();
		
		Cartao cra2 = new Cartao();
		cra2.setConta(cta1);
		cra2.SetCvv(745);
		cra2.SetBandeira("MasterCard");
		cra2.SetSenha(5890);
		cra2.SetValidade(data.getTime());
		cra2.sacar(1400, 5890);
		cra2.mostra();
	}

}