package original;

public class Gerente {
	private Funcionario funcionario;
	
	public Gerente() {
		
	}
	
	public void gerenciar() {
		System.out.println("Avaliação do Funcionário " + funcionario.getNome() + 
				" do cargo de " + funcionario.getCargo());
		funcionario.trabalhando();
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
