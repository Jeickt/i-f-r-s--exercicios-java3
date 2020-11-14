public class _13diagonal_sec {
	public static void main(String[] args) {
		int linha, coluna;
		double matriz[][] = new double[5][5], soma = 0, media;
						
		for(linha = 0; linha < 5; linha++) {
			for(coluna = 0; coluna < 5; coluna++) {
				System.out.printf("Informe o valor para matriz [%d] [%d] ", linha, coluna);
				matriz[linha][coluna] = Double.parseDouble(System.console().readLine());
			}
			soma += matriz[linha][4 - linha];
		}
		media = soma / 5;
		System.out.printf("%.02f ", media);
		}
	}