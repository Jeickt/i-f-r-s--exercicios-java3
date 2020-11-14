public class _14concurso {
	public static void main(String[] args) {
		char gabarito[] = new char[10], candidatos[][] = new char[10][10];
		int linha, coluna, pontos[] = new int[10];
		
		for(linha = 1; linha <= 10; linha++) {
			System.out.printf("Informe o gabarito da %dª questão: ", linha);
			gabarito[linha - 1] = System.console().readLine().charAt(0);
		}
		for(linha = 1; linha <= 10; linha++) {
			for(coluna = 1; coluna <= 10; coluna++) {
				System.out.printf("Informe a resposta %d do %dº candidato: ", coluna, linha);
				candidatos[linha - 1][coluna - 1] = System.console().readLine().charAt(0);
				pontos[linha - 1] = 0;
				if (candidatos[linha - 1][coluna - 1] == gabarito[coluna - 1])
					pontos[linha]++;
			}
		}
		for(linha = 1; linha <= 10; linha++)
			System.out.printf("O candidato %d fez %d pontos.", linha, pontos[linha - 1]);
		}
	}