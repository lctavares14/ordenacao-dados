package modelo;

public class Professor extends Pessoa {
int salario;
public Professor(String nome, int idade, int salario) {
	super(nome, idade);
	this.salario = salario;
	}
public void ensinar(String nome) {
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