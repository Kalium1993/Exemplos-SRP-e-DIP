package srp;

import org.junit.Assert;
import org.junit.Test;

import original.Conta;

public class ContaNormalTest {
	@Test
	public void deveCriarConta() {
		ContaNormal conta = new ContaNormal();
		
		Assert.assertEquals(0, conta.getSaldo());
	}
	
	@Test
	public void deveTestarFuncaoDepositarNaConta() {
		Conta conta = new Conta();
		conta.depositar(1000);
		
		Assert.assertEquals(1000, conta.getSaldo());
	}
	
	@Test
	public void deveTestarFuncaoSacarNaConta() {
		ContaNormal conta = new ContaNormal();
		conta.depositar(1000);
		conta.sacar(700);
		
		Assert.assertEquals(300, conta.getSaldo());
	}
}
