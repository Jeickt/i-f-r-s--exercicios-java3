public class _03classificacao_recrutamento {
	public static void main(String[] args) {
		int idade, experiencia, candidatos_f = 0, candidatos_f2 = 0, candidatos_m = 0, soma_idade_m = 0, soma_idade_f = 0, cont = 0;
		char sexo, outro = 'A';
		double media_idade_m, media_idade_f;
		
		while (outro != 'N') {
			++cont;
			System.out.printf("Digite 'F' ou 'M' como sexo do %dº candidato: ", cont);
			sexo = System.console().readLine().charAt(0);
			System.out.print("Informe sua idade: ");
			idade = Integer.parseInt(System.console().readLine());
			System.out.print("Tem quantos anos de esperiência? ");
			experiencia = Integer.parseInt(System.console().readLine());
		
			if (sexo == 'F') {
				candidatos_f++;
				if (experiencia > 0) {
					soma_idade_f += idade;
					candidatos_f2++;
				}
			}
			if (sexo == 'M') {
				candidatos_m++;
				soma_idade_m += idade;
			}
			System.out.print("Outro candidato('S' para sim, 'N' para não)? ");
			outro = System.console().readLine().charAt(0);
		}
		media_idade_m = soma_idade_m / candidatos_m;
		media_idade_f = soma_idade_f / candidatos_f2; 
		System.out.printf("Quantidade de candidatos do sexo feminino: %d.\n", candidatos_f);
		System.out.printf("Quantidade de candidatos do sexo masculino: %d.\n", candidatos_m);
		System.out.printf("A media de idade masculina é: %d.\n", media_idade_m);
		System.out.printf("A media de idade feminina com experiência é: %d.\n", media_idade_f);
	}
	}