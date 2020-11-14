public class _20mmc {
	public static void main(String[] args) {
		int n1, d1, n2, d2, soma, denominador;

		System.out.printf("Informe o numerador da 1ª fração: ");
		n1 = Integer.parseInt(System.console().readLine());
		System.out.printf("Informe o denominador da 1ª fração: ");
		d1 = Integer.parseInt(System.console().readLine());
		System.out.printf("Informe o numerador da 2ª fração: ");
		n2 = Integer.parseInt(System.console().readLine());
		System.out.printf("Informe o denominador da 2ª fração: ");
		d2 = Integer.parseInt(System.console().readLine());

		soma = (mmc(d1, d2) / d1) * n1 + (mmc(d1, d2) / d2) * n2;

		System.out.printf("A soma das duas frações é: %d.", soma);
	}

	static int mmc(int num1, int num2) {
		int x = 0, cont = 2;

		if (num1 > 0 && num2 > 0) {
			while (num1 != 1 || num2 != 1) {
				if (num1 % cont == 0 || num2 % cont == 0) {
					if (num1 % cont == 0) {
						num1 /= cont;
						x += cont;
						if (num2 % cont == 0)
							num2 /= cont;
					} else if (num2 % cont == 0) {
						num2 /= cont;
						x += cont;
					} else
						cont++;
				}
			}
			return x;
		}
		else
			return x;
	}
}