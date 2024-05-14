package br.hellen.calculadora;

public class Operacoes {

	public double somar(Numero a, Numero b) {
		return a.getValor() + b.getValor();
	}
	
	public double subtrair(Numero a, Numero b) {
		return a.getValor() - b.getValor();
	}
	
	public double multiplicar(Numero a, Numero b) {
		return a.getValor() * b.getValor();
	}
	
	public double dividir(Numero a, Numero b) {
		if(b.getValor() != 0) {
			return a.getValor() / b.getValor();
		}else {
            throw new ArithmeticException("Divisão por zero não é permitida");
		}
	}
	
}
