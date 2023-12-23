package com.belrose.springbootk8s;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringBootK8sApplicationTests {

	@Test
	void contextLoads() {
		log.info("Inside  SpringBootK8sApplicationTests...");
		assertEquals(true,true);
	}

}
