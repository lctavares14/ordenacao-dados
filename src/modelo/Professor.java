package modelo;//pacote

public class Professor /*classe*/ extends Pessoa {/*Heran�a*/
int salario; //variavel

public Professor(String nome, int idade, int salario) {//metodo construtor
	super(nome, idade);//atributo do metodo construtor
	this.salario = salario; //variavel mais atributo
	}
public void ensinar(String nome) { //metodo ensinar
	System.out.println("O professor "+nome+" est� ensinando.");//print do atributo nome do professor
}
}
//email: eudisozatunes@gmail.com

//- Comente o c�dico, (descreva), onde, quais s�o, qual a fun��o, 
//o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= m�todo
//=atributo
//=varialveis
//=here�a