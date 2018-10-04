package atividade;

import java.util.Scanner;

public class Volume {
	static Double result;
	
	static Formula calculadora = new Formula();
	static Scanner entrada = new Scanner(System.in);
	
public static void main(String[] args) {
	
	informeValores();
	calculadora.imprimir();
}

private static void informeValores() {
	System.err.println("Informe a Altura: ");
	calculadora.setLargura(entrada.nextDouble());
	System.err.println("Informe a Largura: ");
	calculadora.setAltura(entrada.nextDouble());
	System.err.println("Informe a comprimento: ");
	calculadora.setComprimento(entrada.nextDouble());
	
	calculadora.calcular();
}
//void formulas() {
//result= numero1*numero2*numero3;
//calcular.a
//}

}