package Composicao;

public class TestaERP {

	public TestaERP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetorEstoque limpeza = new SetorEstoque ("Limpeza", "Leonardo", "C1");
		SetorEstoque massas = new SetorEstoque ("Massas", "Aise", "C2");
		
		itemEstoque ie1 = new itemEstoque(7897, 500, "Amaciante OMO 2L", "Lava Roupas", 12);
		itemEstoque ie2 = new itemEstoque(7896, 300, "Detergente Ypê neutro", "Cozinha", 3);
		itemEstoque ie3 = new itemEstoque(7895, 100, "Pato gel 500ml", "Banheiro", 15);
		
		itemEstoque ie4 = new itemEstoque(7894, 1000, "Molho Heinz 500g tradicional", "Molhos", 2);
		itemEstoque ie5 = new itemEstoque(7893, 600, "Macarrão Parafuso Barilla 500g", "Macarrão", 3);
		
		limpeza.additemEstoque(ie1);
		limpeza.additemEstoque(ie2);
		limpeza.additemEstoque(ie3);
		System.out.println(limpeza.toString());
		
		massas.additemEstoque(ie4);
		massas.additemEstoque(ie5);
		System.out.println(massas.toString());
	}

}
