package org.maia;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {

	@Mock
	List<String> lista; // criando instancia da lista com mock

	@Test
	public void primeiroTesteMockito() {

		Mockito.when(lista.size()).thenReturn(20); // definindo o retorno da lista com mock

		int size = lista.size(); // atribuindo o valor da minha lista a uma variavel int

		Assertions.assertThat(size).isEqualTo(20); // virificando e validando o tamanho da minha lista.

	}

}
