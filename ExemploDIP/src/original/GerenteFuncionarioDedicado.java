package original;

public class GerenteFuncionarioDedicado {
	private FuncionarioDedicado funcionario;
	
	public GerenteFuncionarioDedicado() {
		
	}
	
	public void gerenciar() {
		System.out.println("Avaliação do Funcionário " + funcionario.getNome() + 
				" do cargo de " + funcionario.getCargo());
		funcionario.trabalhando();
	}

	public FuncionarioDedicado getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioDedicado funcionario) {
		this.funcionario = funcionario;
	}
}
