package algNumerosPosiNegZero;

import java.util.Scanner;

public class numeros {
	public static void main(String[] args) { 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero Inteiro: \n");
		Integer numero = entrada.nextInt();
		
		if (numero > 0){ 
		System.out.println(numero +" é positivo"); 
		} else if (numero < 0) { 
		System.out.println(numero+" é negativo"); 
		} else {
		System.out.println(numero+" é igual a 0");
			}	
		}
	}