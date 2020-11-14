public class _06produtos {
	public static void main(String[] args) {
		int codigos[] = new int[10], cont;
		String nomes[] = new String[10];
		double precos[] = new double[10];
		
		for(cont = 1; cont <= 10; cont++) {
			System.out.printf("Qual é o nome do %dº produto? ", cont);
			nomes[cont - 1] = System.console().readLine();
			System.out.printf("Qual é o código do %dº produto? ", cont);
			codigos[cont - 1] = Integer.parseInt(System.console().readLine());
			System.out.printf("Qual é o preço do %dº produto? ", cont);
			precos[cont - 1] = Double.parseDouble(System.console().readLine());
		}
		for(cont = 0; cont < 10; cont++) {
			if (codigos[cont] % 2 == 0 && precos[cont] > 1000)
				System.out.printf("%S , %d, %.2f, %.2f.\n", nomes[cont], codigos[cont], precos[cont], precos[cont] * 1.2);
			else if (codigos[cont] % 2 == 0)
				System.out.printf("%S , %d, %.2f, %.2f.\n", nomes[cont], codigos[cont], precos[cont], precos[cont] * 1.15);
			else if (precos[cont] > 1000)
				System.out.printf("%S , %d, %.2f, %.2f.\n", nomes[cont], codigos[cont], precos[cont], precos[cont] * 1.1);
		}
		}
	}