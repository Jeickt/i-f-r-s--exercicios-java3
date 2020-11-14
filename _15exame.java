public class _15exame {
	public static void main(String[] args) {
		String alunos[] = new String[15];
		int linha, coluna;
		double notas[][] = new double[15][5], soma[] = new double[15], media[] = new double[15];
		
		for(linha = 1; linha <= 15; linha++) {
			System.out.printf("Informe o nome do %dº aluno: ", linha);
			alunos[linha - 1] = System.console().readLine();
		}
		for(linha = 1; linha <= 15; linha++) {
			for(coluna = 1; coluna <= 5; coluna++) {
				System.out.printf("Informe a %dª nota do %dº aluno: ", coluna, linha);
				notas[linha - 1][coluna - 1] = Double.parseDouble(System.console().readLine());
				soma[linha - 1] = 0;
				soma[linha - 1] += notas[linha - 1][coluna - 1];
			}
			media[linha - 1] = soma[linha - 1] / 5;
		}
		for(linha = 0; linha < 15; linha++) {
			if (media[linha] >= 7)
				System.out.printf("O aluno %s obteve média %.1f e está Aprovado!", alunos[linha], media[linha]);
			else if (media[linha] < 2)
				System.out.printf("O aluno %s obteve média %.1f e está Reprovado!", alunos[linha], media[linha]);
			else
				System.out.printf("O aluno %s obteve média %.1f e deve realizar exame.", alunos[linha], media[linha]);
		}
		}
	}