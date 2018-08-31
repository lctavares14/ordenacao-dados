package modelo;

public class Teste {
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa("Um, dois, TrÊs", 99);
		p1.nome = "Daiane goncalves Santana";
		p1.falar();
		
		Aluno a1 = new Aluno("Henrique Nunes Batista", 68, 20);
		a1.sexo = "M";
		a1.estudar();
		a1.falar();
		System.out.println("O nome da pessoa é:" +p1.nome);
		
		Professor prof1 = new Professor("Joao Silva Campos", 69, 2000);
		prof1.falar();
		prof1.ensinar(prof1.nome);
		
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