package modelo;

public class Teste {
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa("Um, dois, Tr�s", 99);
		p1.nome = "Daiane goncalves Santana";
		p1.falar();
		
		Aluno a1 = new Aluno("Henrique Nunes Batista", 68, 20);
		a1.sexo = "M";
		a1.estudar();
		a1.falar();
		System.out.println("O nome da pessoa �:" +p1.nome);
		
		Professor prof1 = new Professor("Joao Silva Campos", 69, 2000);
		prof1.falar();
		prof1.ensinar(prof1.nome);
		
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