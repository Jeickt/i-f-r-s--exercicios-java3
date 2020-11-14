public class _05eleicoes {
	public static void main(String[] args) {
		int voto, soma_1 = 0, soma_2 = 0, soma_3 = 0, soma_4 = 0, soma_5 = 0, soma_6 = 0, soma_total = 0, cont = 0;
		double perc_nulos, perc_brancos;
		
		do {
			System.out.printf("Qual é o %dº voto? ", cont + 1);
			voto = Integer.parseInt(System.console().readLine());
			while (voto < 0 || voto > 6) {
				System.out.print("Número inválido!");
				System.out.printf("Qual é o %dº voto? ", cont + 1);
				voto = Integer.parseInt(System.console().readLine());
			}
			cont++;
			if (voto == 1)
				soma_1++;
			if (voto == 2)
				soma_2++;
			if (voto == 3)
				soma_3++;
			if (voto == 4)
				soma_4++;
			if (voto == 5)
				soma_5++;
			if (voto == 6)
				soma_6++;
			soma_total++;
		} while (voto != 0);
		perc_nulos = (soma_5 / soma_total) * 100;
		perc_brancos = (soma_6 / soma_total) * 100;
		System.out.printf("O candidato 1 recebeu %d votos.\n", soma_1);
		System.out.printf("O candidato 2 recebeu %d votos.\n", soma_2);
		System.out.printf("O candidato 3 recebeu %d votos.\n", soma_3);
		System.out.printf("O candidato 4 recebeu %d votos.\n", soma_4);
		System.out.printf("O total de nulos foi de %d votos.\n", soma_5);
		System.out.printf("O total de brancos foi de %d votos.\n", soma_6);
		System.out.printf("A percentagem de votos nulos foi: %.02f%.\n", perc_nulos);
		System.out.printf("A percentagem de votos brancos foi de %.02%.\n", perc_brancos);
		}
	}