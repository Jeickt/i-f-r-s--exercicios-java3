public class _16fatorial {
	public static void main(String[] args) {
		int soma = 0, cont1 = 100, cont2 = 0;
				
		for(cont1 = 100; cont1 >= 80; cont1--) {
			soma += cont1 / fatorial(cont2);
			cont2++;
		}
		System.out.printf("%d.", soma);
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