package modelo;// pacote

public class Aluno/*Classe aluno*/  extends Pessoa { //Heran�a
	
	String sexo; // variavel
	int matricula; //variavel
	
		// Metodo Construtor
		public Aluno(String nome, int idade, int matricula) {//metodo construtor 
			super(nome, idade);//atributo
			this.matricula = matricula;//variavel mais atributo
		}
	// metodo estudar, imprime mensagem na tela pro usu�rio
	public void estudar() {
		System.out.println("Aluno estudar. ");// aluno estudando
	}
	
}

//email: eudisozatunes@gmail.com

//- Comente o c�dico, (descreva), onde, quais s�o, qual a fun��o, 
// o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= m�todo
//=atributo
//=varialveis
//=here�a