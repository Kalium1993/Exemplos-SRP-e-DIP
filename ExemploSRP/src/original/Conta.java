package original;

public class Conta {
	private int saldo;
	
	public Conta() {
		this.saldo = 0;
	}
	
	public void depositar(int valor) {
		this.saldo += valor;
	}
	
	public void sacar(int valor) {
		this.saldo -= valor;
	}

	public int getSaldo() {
		return saldo;
	}
	
}
