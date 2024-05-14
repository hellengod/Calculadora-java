package br.hellen.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Operacoes opcs = new Operacoes();
		String opc="1";
		while(opc.equals("1")) {
			System.out.println("Digite o primeiro número: ");
			Numero num1 = new Numero(scan.nextDouble());
			
			System.out.println("Digite o segundo número: ");
			Numero num2 = new Numero(scan.nextDouble());
			
			System.out.println("Escolha a operação:"
					+ " 1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
			int escolha = scan.nextInt();
			double resultado = 0;
			
			switch(escolha) {
			case 1:
				resultado = opcs.somar(num1, num2);
				break;
			case 2: 
				resultado = opcs.subtrair(num1, num2);
				break;
			case 3:
				resultado = opcs.multiplicar(num1, num2);
				break;
			case 4:
				try {
					resultado = opcs.dividir(num1, num2);
				}catch(ArithmeticException e) {
					System.out.println(e.getMessage());
					System.out.println("Deseja realizar outra operação? Digite 1 - Sim, 2 - Não");
					opc = scan.next();
					continue;
				}
				break;
				default:
					System.out.println("Operação Inválida");
					return;
			}
			System.out.println("O resultado é: " + resultado);
			System.out.println("Deseja realizar outra operação? Digite 1 - Sim, 2 - Não");
			opc = scan.next();
		}


	}

}
