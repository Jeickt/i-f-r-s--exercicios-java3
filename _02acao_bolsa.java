public class _02acao_bolsa {
	public static void main(String[] args) {
		int numero_acoes_lucro_superior = 0, numero_acoes_lucro_inferior = 0, acoes = 0;
		char tipo_acao;
		double preco_compra, preco_venda;
		
		System.out.print("Digite o tipo da 1� a��o: ");
		tipo_acao = System.console().readLine().charAt(0);
		System.out.print("Digite seu pre�o de compra: ");
		preco_compra = Double.parseDouble(System.console().readLine());
		System.out.print("Digite seu preco de venda: ");
		preco_venda = Double.parseDouble(System.console().readLine());
		
		if (tipo_acao != 'F') {
			do {
				++acoes;
				if ((preco_venda - preco_compra) > 1000)
					numero_acoes_lucro_superior++;
				if ((preco_venda - preco_compra) < 200)
					numero_acoes_lucro_inferior++;
				System.out.printf("Digite o tipo da %d� a��o: ", acoes + 1);
				tipo_acao = System.console().readLine().charAt(0);
				System.out.printf("Digite seu pre�o de compra: ");
				preco_compra = Double.parseDouble(System.console().readLine());
				System.out.printf("Digite seu pre�o de venda: ");
				preco_venda = Double.parseDouble(System.console().readLine());
			} while (tipo_acao != 'F');
		}
				
		System.out.printf("A quantidade de a��es com lucro superior a R$1.000,00 �: %d.\n", numero_acoes_lucro_superior);
		System.out.printf("A quantidade de a��es com lucro inferior a R$200,00 �: %d.\n", numero_acoes_lucro_inferior);
		}			
		}