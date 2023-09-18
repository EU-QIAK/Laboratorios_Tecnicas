package laboratorio01;

import java.util.Scanner;

public class mainvenda {

		public static Scanner ler = new Scanner(System.in);

		public static aluno criaraluno() {
			System.out.println("informe seu nome: ");
			String nome = ler.nextLine();
			System.out.println("informe sua matricula: ");
			int matricula = ler.nextInt();
			
			return new aluno(nome, matricula);
		}
		public static boolean decida(String decisao) {
			Scanner lermais = new Scanner(System.in);
			
			System.out.println("quer que coloque " + decisao + "?");
			String reposta = lermais.nextLine();
			
			if(reposta.toLowerCase().equals("sim")) {
				return true;
			}
			if(reposta.toLowerCase().equals("nao")) 
				return false;
			else 
				decida(decisao);
			return false;
		}
		public static adicional criaradicional() {
			boolean maionese = decida("maionese");
			boolean ketchup = decida("ketchup");
			boolean ovo = decida("ovo");
			boolean batatapaia = decida("batata palha");
						
			return new adicional(maionese, ketchup, ovo, batatapaia);
		}
		
		public static cachorroquente criarcachorro() {
			Scanner leraindamais = new Scanner(System.in);
			
			System.out.println("qual proteina voce prefere?(salsicha, linguiça, frango ou bacon.) ");
			String proteina = leraindamais.nextLine();
			System.out.println("qual queijo você prefere?(mussarela, prato, parmesão ou coalho.) ");
			String queijo = leraindamais.nextLine();
			System.out.println("qual bebida você prefere?(Coca-cola, Del Rio ou Suco do Chaves.) ");
			String bebida = leraindamais.nextLine();
			
			
			return new cachorroquente(proteina, queijo, bebida);
		}
		
		public static void main(String[] args) {
			aluno aluno = criaraluno();
			
			System.out.println("quantos cachorros voce vai querer mestre?: ");
			int quantos = ler.nextInt();
			ler.nextLine();
			cachorroquente hotdog[] = new cachorroquente[quantos];
			for (int i = 0; i < quantos; i++) {
				hotdog[i] = criarcachorro();
			}
			adicional adicionando = criaradicional();
			
			venda pedido = new venda(aluno, hotdog, adicionando);
			pedido.notadopedido(pedido);
		}
}

