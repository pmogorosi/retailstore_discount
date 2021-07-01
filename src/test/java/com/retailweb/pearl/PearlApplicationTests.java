package com.retailweb.pearl;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PearlApplicationTests {

	@Autowired
	private IBillService  billService;

	@Test
	void contextLoads() throws Exception {

		assertThat(billService).isNotNull();
	}


	@Test
void exceptionTesting() {
	Bill bill = new Bill();
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> bill.setBillOwner(8));
    assertEquals("Bill Owner Id must be an Integer.", exception.getMessage());
}


}
