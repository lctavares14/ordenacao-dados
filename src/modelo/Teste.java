package modelo; //pacote

public class Teste {//classe de teste
	public static void main(String[] args) {//metodo principal para execu��o da classe e outras classes
	
		Pessoa p1 = new Pessoa("Um, dois, Tr�s", 99);// metodo para chamar classe pessoa
		p1.nome = " Daiane goncalves Santana";//atributo
		p1.falar();//metodo falar
		
		Aluno a1 = new Aluno("Henrique Nunes Batista", 68, 20);// metodo para chamar classe aluno
		a1.sexo = "M";//atributo
		a1.estudar();//metodo estudar
		a1.falar();//metodo falar
		System.out.println("O nome da pessoa �:" +p1.nome);//print do atributo nome mais o objeto p1
		
		Professor prof1 = new Professor("Joao Silva Campos", 69, 2000);// metodo para chamar classe professor
		prof1.falar();//metodo falar
		prof1.ensinar(prof1.nome);//metodo ensinar
		
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