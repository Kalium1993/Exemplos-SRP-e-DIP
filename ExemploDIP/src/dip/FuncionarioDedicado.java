package dip;

public class FuncionarioDedicado implements Funcionario {
	private String nome;
	private String cargo;
	
	public FuncionarioDedicado(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public void trabalhando() {
		System.out.println("O funcionário está trabalhando com dedicação");
	}
	
	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}
	
}
