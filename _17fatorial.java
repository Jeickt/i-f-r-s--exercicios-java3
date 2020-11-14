public class _17fatorial {
	public static void main(String[] args) {
		int cont, x;
		double soma = 1;

		System.out.print("Informe o número da variável x: ");
		x = Integer.parseInt(System.console().readLine());
				
		for(cont = 1; cont <=14; cont++)
			soma += (Math.pow(x, cont)) / fatorial(cont);
		
		System.out.printf("O resultado é: %.2f", soma);
		}
		
	static int fatorial(int num) {
	int fat = 1;
	if (num == 0 || num == 1)
		return 1;
	else {
		while (num != 1) {
			fat *= num;
			num--;
		}
		return fat;
}
}
}