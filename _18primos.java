public class _18primos {
	public static void main(String[] args) {
		int cont;

		System.out.print("2 ");

		for(cont = 3; cont <= 100; cont++) {
			if (primo(cont) == 1)
				System.out.printf("%d ", cont);
		}
	}
	
	static int primo(int num) {
	int cont;

	for (cont = 2; cont < num; cont++) {
		if (num % cont == 0)
			return 0;
	}
	return 1;
}
}