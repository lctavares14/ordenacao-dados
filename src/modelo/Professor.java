package modelo;

public class Professor extends Pessoa {
int salario;
public Professor(String nome, int idade, int salario) {
	super(nome, idade);
	this.salario = salario;
	}
public void ensinar(String nome) {
	System.out.println("O professor"+nome+" est� ensinando.");
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