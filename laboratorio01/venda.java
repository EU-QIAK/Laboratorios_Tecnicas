package laboratorio01;

public class venda {

	public aluno aluno;
	public cachorroquente cachorroquente[];
	public adicional adicional;
	
	public venda(aluno aluno, cachorroquente cachorroquente[], adicional adicional) {
		this.aluno = aluno;
		this.cachorroquente=cachorroquente;
		this.adicional=adicional;
	}
	
	public static void notadopedido(venda venda) {
		System.out.println("\nNOTA DO PEDIDO: ");
		System.out.println("nome do aluno: " + venda.aluno.nome);
		System.out.println("sua matricula: " + venda.aluno.matricula);
		for (int i = 0; i < venda.cachorroquente.length; i++) {
			System.out.println("\nCachorros quentes: " + (i+1));
			System.out.println("proteina: " + venda.cachorroquente[i].proteina);
			System.out.println("queijo: " + venda.cachorroquente[i].queijos);
			System.out.println("bebida: " + venda.cachorroquente[i].bebida);
		}
		
		System.out.println("\nADICIONAIS: ");
		if(venda.adicional.maionese) {
			System.out.println("-maionese");
		}
		if(venda.adicional.ketchup) {
			System.out.println("-ketchup");
		}
		if(venda.adicional.ovo) {
			System.out.println("-ovo");
		}
		if(venda.adicional.batatapaia) {
			System.out.println("-batata Palha");
		}
	}
}