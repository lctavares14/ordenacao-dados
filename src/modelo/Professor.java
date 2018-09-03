package modelo;//pacote

public class Professor /*classe*/ extends Pessoa {/*Herança*/
int salario; //variavel

public Professor(String nome, int idade, int salario) {//metodo construtor
	super(nome, idade);//atributo do metodo construtor
	this.salario = salario; //variavel mais atributo
	}
public void ensinar(String nome) { //metodo ensinar
	System.out.println("O professor "+nome+" está ensinando.");//print do atributo nome do professor
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