package modelo;

public class Aluno/*Classe aluno*/  extends Pessoa { //Herança
	
	String sexo; // variavel
	int matricula; //variavel
	
		// Metodo Construtor
		public Aluno(String nome, int idade, int matricula) {
			super(nome, idade);//atributo
			this.matricula = matricula;
		}
	// metodo estudar, imprime mensagem na tela pro usuário
	public void estudar() {
		System.out.println("Aluno estudar. ");
	}
	
}

//email: eudisozatunes@gmail.com

//- Comente o códico, (descreva), onde, quais são, qual a função, 
// o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= método
//=atributo
//=varialveis
//=hereça