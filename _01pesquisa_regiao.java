public class _01pesquisa_regiao {
	public static void main(String[] args) {
		int idade, pesquisados = 0, maior_idade = 0, menor_idade = 0, quant_mulheres = 0, idade_menor_salario = 0;
		char sexo, sexo_menor_salario = 'A';
		double salario, soma_salarios = 0, media_salarios, menor_salario;
		
		System.out.print("Digite a idade do 1� habitante: ");
		idade = Integer.parseInt(System.console().readLine());
		System.out.print("Digite 'M' ou 'F' como sexo do 1� habitante: ");
		sexo = System.console().readLine().charAt(0);
		System.out.print("Digite o sal�rio do 1� habitante: ");
		salario = Double.parseDouble(System.console().readLine());
		
		if (idade >= 0) {
			maior_idade = idade;
			menor_idade = idade;
			idade_menor_salario = idade;
			sexo_menor_salario = sexo;
			menor_salario = salario;
			do {
				++pesquisados;
				soma_salarios += salario;
				if (maior_idade < idade)
					maior_idade = idade;
				if (menor_idade > idade)
					menor_idade = idade;
				if (sexo == 'F' && salario <= 1500)
					quant_mulheres++;
				if (salario <= menor_salario) {
					menor_salario = salario;
					idade_menor_salario = idade;
					sexo_menor_salario = sexo;
				}
				System.out.printf("Digite a idade do %d� habitante: ", pesquisados + 1);
				idade = Integer.parseInt(System.console().readLine());
				System.out.printf("Digite 'M' ou 'F' como sexo do %d� habitante: ", pesquisados + 1);
				sexo = System.console().readLine().charAt(0);
				System.out.printf("Digite o sal�rio do %d� habitante: ", pesquisados + 1);
				salario = Double.parseDouble(System.console().readLine());
			} while (idade >= 0);
		}
		media_salarios = soma_salarios / pesquisados;
		
		System.out.printf("A media dos sal�rios do grupo �: %.2f\n.", media_salarios);
		System.out.printf("A maior idade do grupo �: %d.\n", maior_idade);
		System.out.printf("A menor idade do grupo �: %d.\n", menor_idade);
		System.out.printf("A quantidade de mulheres com baixo sal�rio �: %d.\n", quant_mulheres);
		System.out.printf("A idade e o sexo da pessoa com menor sal�rio s�o: %d e %c.", idade_menor_salario, sexo_menor_salario);
		}			
		}