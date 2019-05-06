package original;

public class Funcionario {
	private String nome;
	private String cargo;
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public void trabalhando() {
		System.out.println("O funcionário está trabalhando");
	}

	public String getCargo() {
		return cargo;
	}

	public String getNome() {
		return nome;
	}
	
}
