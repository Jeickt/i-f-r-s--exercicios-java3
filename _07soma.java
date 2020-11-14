public class _07soma {
	public static void main(String[] args) {
		int num[] = new int[5], cont, soma = 0;
		
		for(cont = 1; cont <= 5; cont++) {
			System.out.printf("Qual é o %dº número? ", cont);
			num[cont - 1] = Integer.parseInt(System.console().readLine());
			soma += num[cont - 1];
		}
		System.out.printf("Os números digitados foram: %d + %d + %d + %d + %d = %d", num[0], num[1], num[2], num[3], num[4], soma);
		}
	}