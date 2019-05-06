package dip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GerenteTest {
	@Test
	public void deveTestarGerenteParaFuncionarioNormal() {
		Gerente gerente = new Gerente();
		gerente.setFuncionario(new FuncionarioNormal("Fulano", "DEV"));
		
		gerente.gerenciar();
		
		assertEquals("Fulano", gerente.getFuncionario().getNome());
		assertEquals("DEV", gerente.getFuncionario().getCargo());
	}
	
	@Test
	public void deveTestarCriacaoGerente() {
		Gerente gerente = new Gerente();
		gerente.setFuncionario(new FuncionarioDedicado("Ciclano", "TESTER"));
		
		gerente.gerenciar();
		
		assertEquals("Ciclano", gerente.getFuncionario().getNome());
		assertEquals("TESTER", gerente.getFuncionario().getCargo());
	}
}
