public class _11matriz {
	public static void main(String[] args) {
		int linha, coluna, matriz[][] = new int[6][4], maior[] = {0, 0, 0, 0, 0, 0};
						
		for(linha = 0; linha < 6; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.printf("Informe o valor para matriz [%d] [%d] ", linha, coluna);
				matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
				if (maior[linha] < matriz[linha][coluna])
					maior[linha] = matriz[linha][coluna];
			}
		}
		for(linha = 0; linha < 6; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				matriz[linha][coluna] = matriz[linha][coluna] * maior[linha];
			}
		}
		for(linha = 0; linha < 6; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.printf("%d ", matriz[linha][coluna]);
			}
			System.out.printf("\n");
		}
		}
	}