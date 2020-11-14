public class _12diagonal {
	public static void main(String[] args) {
		int linha, coluna, matriz[][] = new int[10][10], soma = 0;
		double media;
						
		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 10; coluna++) {
				System.out.printf("Informe o valor para matriz [%d] [%d] ", linha, coluna);
				matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
			}
			soma += matriz[linha][linha];
		}
		media = soma / 10;
		System.out.printf("%.02f ", media);
		}
	}