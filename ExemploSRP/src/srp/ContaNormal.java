package srp;

public class ContaNormal {
	private int saldo;
	FuncoesConta funcao;
	
	public ContaNormal() {
		this.saldo = 0;
	}
	
	public void depositar(int valor) {
		funcao = new Depositar();
		int depositar = funcao.funcao(saldo, valor);
		
		this.saldo = depositar;
	}
	
	public void sacar(int valor) {
		funcao = new Sacar();
		int sacar = funcao.funcao(saldo, valor);
		
		this.saldo = sacar;
	}

	public int getSaldo() {
		return saldo;
	}
}
