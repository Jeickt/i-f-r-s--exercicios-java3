public class _09subtracao {
	public static void main(String[] args) {
		int num1[] = new int[5], num2[] = new int[5], soma[] = new int[5], cont;
				
		for(cont = 1; cont <= 5; cont++) {
			System.out.printf("Digite um número: ");
			num1[cont - 1] = Integer.parseInt(System.console().readLine());
			System.out.printf("Digite outro número: ");
			num2[cont - 1] = Integer.parseInt(System.console().readLine());
		}
		for(cont = 0; cont < 5; cont++)
			soma[cont] = num2[Math.abs(4 - cont)] - num1[cont];
		
		for (cont = 0; cont < 5; cont++)
			System.out.printf("%d - %d = %d.\n", num2[Math.abs(4 - cont)], num1[cont], soma[cont]);
		}
	}