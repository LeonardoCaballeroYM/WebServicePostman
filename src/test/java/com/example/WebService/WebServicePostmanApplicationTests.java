package com.example.WebService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebServicePostmanApplicationTests {

	@Test
	void getMessageTest() {
		ServidorWEBRest servidor = new ServidorWEBRest();
        String resultado = servidor.imprimir();
        assertEquals("Saludos desde spring boot <3", resultado);
	}

}
