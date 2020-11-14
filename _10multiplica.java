public class _10multiplica {
	public static void main(String[] args) {
		int cont;
		double num1[] = new double[20], num2[] = new double[20], maior = -1000000;
				
		for(cont = 1; cont <= 20; cont++) {
			System.out.printf("Digite o %dº número: ", cont);
			num1[cont - 1] = Double.parseDouble(System.console().readLine());
			if (num1[cont - 1] > maior)
				maior = num1[cont - 1];
		}
		System.out.printf("Os valores resultantes são: ");
		
		for(cont = 0; cont < 20; cont++) {
			num2[cont] = num1[cont] / maior;
			System.out.printf("%.4f ", num2[cont]);
		}
		}
	}