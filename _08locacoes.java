public class _08locacoes {
	public static void main(String[] args) {
		int dvds[] = new int[8], cont;
		String clientes[] = new String[8];
				
		for(cont = 1; cont <= 8; cont++) {
			System.out.printf("Qual é o nome do %dº cliente? ", cont);
			clientes[cont - 1] = System.console().readLine();
			System.out.printf("Qual é o número de DVDs locados em 2017? ");
			dvds[cont - 1] = Integer.parseInt(System.console().readLine());
			
		}
		for(cont = 0; cont < 8; cont++)
			System.out.printf("Nome: %S , locações grátis: %d.\n", clientes[cont], dvds[cont] / 10);
		}
	}