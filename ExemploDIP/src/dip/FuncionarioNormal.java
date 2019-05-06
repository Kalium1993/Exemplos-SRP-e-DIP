package dip;

public class FuncionarioNormal implements Funcionario{
	private String nome;
	private String cargo;
	
	public FuncionarioNormal(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public void trabalhando() {
		System.out.println("O funcionário está trabalhando");
	}
	
	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}
	
}
