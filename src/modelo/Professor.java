package modelo;

public class Professor /*classe*/ extends Pessoa {/*Herança*/
int salario; //variavel

public Professor(String nome, int idade, int salario) {//metodo construtor
	super(nome, idade);
	this.salario = salario;
	}
public void ensinar(String nome) { //metodo ensinar
	System.out.println("O professor"+nome+" está ensinando.");
}
}
//email: eudisozatunes@gmail.com

//- Comente o códico, (descreva), onde, quais são, qual a função, 
//o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= método
//=atributo
//=varialveis
//=hereça