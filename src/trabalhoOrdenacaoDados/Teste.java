package trabalhoOrdenacaoDados;

public class Teste {
	
		public static void main(String[] args) {

	Empresa empresa = new Empresa();
		
	Empresa.nome = "Mecanica Tavares";
		Empresa.CNPJ = "7205580001-52";
		Funcionario.metas = "Concerta o Carro";
		Funcionario.salario = (double) 1000;
		Proprietario.gerenciamento = "SOCIO PROPRIETARIO";
		System.out.println("Nome da Empressa: " + Empresa.nome+ ", " + "CNPJ: " + Empresa.CNPJ);
		System.out.println("Meta para o Funcionario: " + Funcionario.metas + ", " +
	 "Salario Mensal: " + Funcionario.salario);
			
		System.out.println("Anselmo Tavares " + Proprietario.gerenciamento);
		System.out.println("Lucas Tavares " + Proprietario.gerenciamento);
		
		
			
		

	}

}
