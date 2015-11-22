package executartestes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import manipulacao.PrazoFinanciamento;
import manipulacao.ValorSuperior;


@RunWith(Suite.class)
@SuiteClasses({PrazoFinanciamento.class, ValorSuperior.class})
public class ExecutaTodosTestes {

	@Test
	public void test() {
	}

}
