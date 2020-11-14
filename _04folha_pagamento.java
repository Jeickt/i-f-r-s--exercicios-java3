public class _04folha_pagamento {
	public static void main(String[] args) {
		int i;
		char nome;
		double salario, liquido, desconto_ir, teto1, teto2, teto3, teto4, aliquota, corte1, corte2, plano_saude, folha = 0, total_imposto = 0;
		
		teto1 = 1903.98;
		teto2 = 2826.65;
		teto3 = 3751.05;
		teto4 = 4664.68;
		corte1 = 1693.72;
		corte2 = 2822.90;
		
		for (i = 0; i < 58; i++) {
			System.out.printf("Qual é o nome do %dº funcionário: ", i + 1);
			nome = System.console().readLine().charAt(0);
			System.out.print("Qual é o seu salário? ");
			salario = Double.parseDouble(System.console().readLine());
			if (salario > teto4)
				desconto_ir = (salario - teto4) * 0.275 + (teto4 - teto3) * 0.225 + (teto3 - teto2) * 0.15 + (teto2 - teto1) * 0.075;
			else if (salario > teto3)
				desconto_ir = (salario - teto3) * 0.225 + (teto3 - teto2) * 0.15 + (teto2 - teto1) * 0.075;
			else if (salario > teto2)
				desconto_ir = (salario - teto2) * 0.15 + (teto2 - teto1) * 0.075;
			else if (salario > teto1)
				desconto_ir = (salario - teto1) * 0.075;
			else
				desconto_ir = 0;
			
			if (salario > corte2)
				aliquota = salario * 0.11;
			else if (salario > corte1)
				aliquota = salario * 0.09;
			else
				aliquota = salario * 0.08;
			
			plano_saude = salario * 0.045;
			liquido = salario - desconto_ir - aliquota - plano_saude;
			folha += liquido;
			total_imposto += desconto_ir;
			System.out.printf("O salário líquido de %c é: %.02f.\n", nome, liquido);
		}
		System.out.printf("O total da folha somou: %.02f.\n", folha);
		System.out.printf("O total de impostos a recolher é: %.02f.\n", total_imposto);
		}
	}