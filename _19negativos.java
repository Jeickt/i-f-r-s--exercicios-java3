public class _19negativos {
	public static void main(String[] args) {
		int cont, vetorA[] = new int[25];

		for(cont = 0; cont < 25; cont++) {
			System.out.printf("Digite o %dº valor: ", cont + 1);
			vetorA[cont] = Integer.parseInt(System.console().readLine()); 
		}
		vetorA = negativos(vetorA);

		for(cont = 0; cont < vetorA.length; cont++)
			System.out.printf("%d ", vetorA[cont]);
	}
	
	static int[] negativos(int vet[]) {

		for (int cont = 0; cont < vet.length; cont++) {
			if (vet[cont] < 0)
				vet[cont] = 0;
		}
		return vet;
}
}